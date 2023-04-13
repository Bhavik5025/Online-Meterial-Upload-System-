package com.course.online_course_system.controller;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.course.online_course_system.Entity.Admin;
import com.course.online_course_system.Entity.Teacher;
import com.course.online_course_system.Entity.VerifiedTeacher;
import com.course.online_course_system.Service.AdminService;
import com.course.online_course_system.Service.TeacherService;
import com.course.online_course_system.Service.VerifiedTeacherService;
import com.course.online_course_system.Service.studentService;

import jakarta.persistence.TypedQuery;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService ad;
	@Autowired
	private TeacherService td;
	@Autowired
	private VerifiedTeacherService vd;
	@GetMapping("/admin_registration")
	public String insert_admin()
	{
		return "admin_registration.jsp";
	}

	@GetMapping("/store_admin_data")
	public String store_admin_data(@RequestParam (value = "name", required = true) String name,
		@RequestParam(value="mobile",required=true) long mobile,@RequestParam(value="password",required=true) String password, ModelMap Admin)
	{
		Admin t=new Admin(name,mobile,password);
		ad.addAdmin(t);
		return "login.jsp";
	}
	
	@GetMapping("/login")
	public String login_admin()
	{
		return "login.jsp";
	}
	
//	@PostMapping("/login_admin")
//	public String login_admin(Model Admin,HttpSession hs,java.net.http.HttpRequest rs)
//	{
//		
//		// create a query
//		
//		long mobile = (long)rs.
//		String password = (String)rs.getAttribute("password");
//		
//		if((ad.fetchAdmin(mobile, password))==true)
//		{
//			hs.setAttribute("mobile", mobile);
//			hs.setAttribute("password", password);
//			Admin.addAttribute("teachers",td.getTeachers());
//			System.out.println(td.getTeachers());
//			return "Admin_Home.jsp";
//					
//		}
//		else {
//			Admin.addAttribute("message", "Please Enter valid Mobile number And Password");
//			return "login.jsp";
//		}
//	}
	
	@PostMapping("/login_admin")
	public String login_admin(@RequestParam(value="mobile",required=true) long mobile,@RequestParam(value="password",required=true) String password, Model Admin,HttpSession hs)
	{
		
		// create a query
		String mo=String.valueOf(mobile);
		if(mo.equals("9723362082") && password.equals("4142"))
		{
			hs.setAttribute("mobile", mobile);
			hs.setAttribute("password", password);
			System.out.println(hs.getAttribute("mobile"));
			System.out.println(hs.getAttribute("password"));
			Admin.addAttribute("teachers",td.getTeachers());
			System.out.println(td.getTeachers());
			return "Admin_Home.jsp";
					
		}
		else {
			Admin.addAttribute("message", "Please Enter valid Mobile number And Password");
			return "login.jsp";
		}
	}
	
	@GetMapping("/return")
	public String return_home(HttpSession hs,Model Admin)
			{
			if(hs.getAttribute("mobile")!=null && hs.getAttribute("password")!=null)
			{
				Admin.addAttribute("teachers",td.getTeachers());
				System.out.println(td.getTeachers());
				return "Admin_Home.jsp";
			}
			else {
				return "Admin_Home.jsp";
			}
			}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id,Model Admin) {
		td.deleteTeacher(id);
		Admin.addAttribute("teachers",td.getTeachers());
		System.out.println(td.getTeachers());
		return "/admin/Admin_Home.jsp";
	}
	
	@GetMapping("/approve/{id}")
	public String approve(@PathVariable("id") int id,Model Admin) {
		Teacher temp1 = td.getObjectById(id);
		System.out.println(temp1);
		VerifiedTeacher temp2 = new VerifiedTeacher();
	    temp2.setMobile_no(temp1.getMobile_no());
	    temp2.setName(temp1.getName());
	    temp2.setPassword(temp1.getPassword());
	    temp2.setQualification(temp1.getQualification());
		td.deleteTeacher(id);
		vd.addTeacher(temp2);
		System.out.println(temp2);
		Admin.addAttribute("teachers",td.getTeachers());
		System.out.println(td.getTeachers());
		return "/admin/Admin_Home.jsp";
	}
	
	@GetMapping("/approvedTeachers")
	public String approvedTeacher(Model Admin) {
		Admin.addAttribute("teachers",vd.getTeachers());
		System.out.println(vd.getTeachers());
		return "/admin/ApprovedTeacherList.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession hs,Model Admin) {
		hs.removeAttribute("mobile");
		hs.removeAttribute("password");
		return "/insert.jsp";
	}
	
	
}
