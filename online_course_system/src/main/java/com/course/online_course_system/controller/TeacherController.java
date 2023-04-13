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

import com.course.online_course_system.Entity.Material;
import com.course.online_course_system.Entity.Teacher;
import com.course.online_course_system.Service.MaterialService;
import com.course.online_course_system.Service.TeacherService;
import com.course.online_course_system.Service.VerifiedTeacherService;

import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	private TeacherService td;
	@Autowired
	private VerifiedTeacherService vd;
	@Autowired
	private MaterialService md;

@GetMapping("/teacher_registration")
public String insert_teacher()
{
	return "registration_teacher.jsp";
}

@GetMapping("/store_teacher_data")
public String store_teacher_data(@RequestParam (value = "name", required = true) String name,
		@RequestParam(value = "qualification", required = true) String qualification,@RequestParam(value="mobile",required=true) long mobile,@RequestParam(value="password",required=true) String password, ModelMap Teacher)
{
	Teacher t=new Teacher(name,qualification,mobile,password);
	td.addTeacher(t);
	Teacher.addAttribute("message","You will be verified soon by admin");
	return "/teacher/registration_teacher.jsp";
}
@GetMapping("/login")
public String login()
{
	return "login.jsp";
}

@PostMapping("/login_teacher")
public String login_admin(@RequestParam(value="mobile",required=true) long mobile,@RequestParam(value="password",required=true) String password, Model Admin,HttpSession hs)
{
	
	// create a query
	int c = vd.fetch_data(mobile, password);
	if(c != 0)
	{
		hs.setAttribute("id",c);
		System.out.println(hs.getAttribute("id"));
	
		return "Teacher_Home.jsp";
				
	}
	else {
		Admin.addAttribute("message", "Please Enter valid Mobile number And Password");
		return "login.jsp";
	}
}

@PostMapping("/store_material")
public String store_material(@RequestParam(value="material_name",required=true) String material_name,@RequestParam(value="link",required=true) String material_link, Model Admin,HttpSession hs)
{
	if(hs.getAttribute("id") == null) {
		return "/teacher/login.jsp";
	}
	Material m = new Material();
	m.setTeacherId((int)hs.getAttribute("id"));
	m.setMaterialName(material_name);
	m.setLink(material_link);
	md.store_material(m);
	String str = material_name + " material successfully added";
	Admin.addAttribute("message",str);
	return "Teacher_Home.jsp";
	
}

@RequestMapping("/home")
public String return_home(HttpSession hs)
{	
	if(hs.getAttribute("id") == null) {
		return "/teacher/login.jsp";
	}
	return "Teacher_Home.jsp";
}

@GetMapping("/history")
public String history(Model Admin,HttpSession hs) {
	if(hs.getAttribute("id") == null) {
		return "/teacher/login.jsp";
	}
	Admin.addAttribute("materials",md.getByTeacherId((int)hs.getAttribute("id")));
	System.out.println(md.getByTeacherId((int)hs.getAttribute("id")));
	return "History.jsp";
}

@GetMapping("/delete/{id}")
public String delete(@PathVariable("id") int id,Model Admin,HttpSession hs) {
	if(hs.getAttribute("id") == null) {
		return "/teacher/login.jsp";
	}
	md.deleteById(id);
	Admin.addAttribute("materials",md.getByTeacherId((int)hs.getAttribute("id")));
	System.out.println(md.getByTeacherId((int)hs.getAttribute("id")));
	return "/teacher/History.jsp";
}

@GetMapping("/profile")
public String profile(Model Admin,HttpSession hs) {
	if(hs.getAttribute("id") == null) {
		return "/teacher/login.jsp";
	}
	Admin.addAttribute("teacher",vd.getByTeacherId((int)hs.getAttribute("id")));
	System.out.println(vd.getByTeacherId((int)hs.getAttribute("id")));
	return "/teacher/profile.jsp";
}

@GetMapping("/logout")
public String logout(Model Admin,HttpSession hs) {
	hs.removeAttribute("id");
	return "/insert.jsp";
}


}
