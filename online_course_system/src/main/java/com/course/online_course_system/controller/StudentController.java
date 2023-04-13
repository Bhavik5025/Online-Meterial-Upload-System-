package com.course.online_course_system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

import com.course.online_course_system.Entity.Material;
import com.course.online_course_system.Entity.Student;
import com.course.online_course_system.Entity.VerifiedTeacher;
import com.course.online_course_system.Service.MaterialService;
import com.course.online_course_system.Service.VerifiedTeacherService;
import com.course.online_course_system.Service.studentService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private studentService sd;
	@Autowired
	private MaterialService md;
	
	@Autowired
	private VerifiedTeacherService vd;
	@GetMapping("/student_registration")
	public String insert()
	{
		return "Registration_student.jsp";
	}
	
	@GetMapping("/store_student_data")
	public String  store_student_data(@RequestParam (value = "name", required = true) String name,
			@RequestParam(value = "age", required = true) int age,@RequestParam(value="mobile",required=true) long mobile,@RequestParam(value="password",required=true) String password, ModelMap Student)
	{
		Student s=new Student(name,age,mobile,password);
		sd.addstudent(s);
		return "login.jsp";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/student/login.jsp";
	}
	
	@PostMapping("/login_student")
	public String login_admin(@RequestParam(value="mobile",required=true) long mobile,@RequestParam(value="password",required=true) String password, Model Admin,HttpSession hs)
	{
		
		// create a query
		int c = sd.fetch_data(mobile, password);
		if(c != 0)
		{
			hs.setAttribute("id",c);
			System.out.println(hs.getAttribute("id"));
			Admin.addAttribute("teachers",vd.getTeachers());
			System.out.println(vd.getTeachers());
			return "/student/Student_Home.jsp";
					
		}
		else {
			Admin.addAttribute("message", "Please Enter valid Mobile number And Password");
			return "/student/login.jsp";
		}
	}
	
	@GetMapping("/view_materials/{id}")
	public String viewMaterial(@PathVariable(value="id",required=true) int id,Model Admin,HttpSession hs) {
		if(hs.getAttribute("id") == null) {
			return "/student/login.jsp";
		}
		List<Material> materials =  md.getMaterials();
		hs.setAttribute("teacher_id",id);
		System.out.println(materials);
		List<Material> answer = new ArrayList<Material>();
		for(Material m : materials) {
			boolean check = true;
			if(m.getTeacherId() == id ) {
				List<Student> students = m.getStudents();
				for(Student s : students) {
					if(s.getId() == (int)hs.getAttribute("id")) {
						check = false;
					}
				}
				if(check == true) {
					answer.add(m);
				}
			}
		}
		System.out.println(answer);
		System.out.println("hello");
		Admin.addAttribute("materials",answer);
		return "/student/ViewMaterial.jsp";
		
	}
	
	@GetMapping("/add_material/{id}")
	public String addMaterial(@PathVariable("id") int id,Model Admin,HttpSession hs) {
		if(hs.getAttribute("id") == null) {
			return "/student/login.jsp";
		}
		Student s = sd.getObjectById((int)hs.getAttribute("id"));
		Material m = md.getObjectById(id);
		List<Material> materials = s.getMaterials();
		materials.add(m);
		s.setMaterials(materials);
		List<Student> students = m.getStudents();
		students.add(s);
		m.setStudents(students);
		sd.addstudent(s);
		md.store(m);
		return "redirect:/student/view_materials/"+(int)hs.getAttribute("teacher_id");
	}
	
	@GetMapping("/favourite_materials")
	public String favourite_materials(Model Admin,HttpSession hs) {
		if(hs.getAttribute("id") == null) {
			return "/student/login.jsp";
		}
		Student s = sd.getObjectById((int)hs.getAttribute("id"));
		Admin.addAttribute("materials",s.getMaterials());
		List<Material> m=s.getMaterials();
		
		HashMap<Integer,String> sr=new HashMap<>();
		for(Material m1:m)
		{
			VerifiedTeacher tid=vd.getByTeacherId(m1.getTeacherId());
			sr.put(tid.getId(), tid.getName());
			
			
		}
		System.out.println(sr);
		Admin.addAttribute("teacher_name",sr);
		Admin.addAttribute("teachers",vd.getTeachers());
		System.out.println(Admin.getAttribute("materials"));
		return "/student/favourite_materials.jsp";
	}
	
	@GetMapping("/Return_home")
	public String home(Model Admin,HttpSession hs)
	{
		if(hs.getAttribute("id") == null) {
			return "/student/login.jsp";
		}
		Admin.addAttribute("teachers",vd.getTeachers());
		System.out.println(vd.getTeachers());
		return "/student/Student_Home.jsp";

	}
	
	
	@GetMapping("/logout")
	public String logout(Model Admin,HttpSession hs) {
		hs.removeAttribute("id");
		return "/insert.jsp";
	}
	
	@GetMapping("/profile")
	public String profile(Model Admin,HttpSession hs) {
		if(hs.getAttribute("id") == null) {
			return "/student/login.jsp";
		}
		Admin.addAttribute("student",sd.getByStudentId((int)hs.getAttribute("id")));
		
		System.out.println(sd.getByStudentId((int)hs.getAttribute("id")));
		return "/student/profile.jsp";
	}


}
