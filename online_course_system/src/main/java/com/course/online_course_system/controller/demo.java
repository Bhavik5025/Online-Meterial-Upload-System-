package com.course.online_course_system.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.course.online_course_system.Entity.Student;

import com.course.online_course_system.Service.studentService;

@Controller
public class demo {
	@Autowired
	private studentService sd;
	
@GetMapping("/")
public String get()
{
	return "insert.jsp";
}

//@GetMapping("student/student_registration")
//public String insert()
//{
//	return "/Student/Registration_student.jsp";
//}

//@GetMapping("/store_student_data")
//public String  store_student_data(@RequestParam (value = "name", required = true) String name,
//		@RequestParam(value = "age", required = true) int age,@RequestParam(value="mobile",required=true) double mobile,@RequestParam(value="password",required=true) String password, ModelMap Student)
//{
//	Student s=new Student(name,age,mobile,password);
//	sd.addstudent(s);
//	return "Home.jsp";
//}

//@GetMapping("store")
//public String save(@RequestParam (value = "uname", required = true) String name,
//@RequestParam(value = "age", required = true) int age, ModelMap Student)
//{	
//	Student s=new Student(name,age);
//	sd.addstudent(s);
//	return "Home.jsp";
//}
//
//@GetMapping("update/{id}")
//public String show(@PathVariable int id,ModelMap Student)
//{
//	Student s = sd.getObjectById(id);
//	Student.addAttribute("name",s.getName());
//	Student.addAttribute("age",s.getAge());	 
//	Student.addAttribute("id",s.getId());
//	
//	return "updatepage.jsp";
//}
//
//@GetMapping("update/performupdate")
//public String show1(@RequestParam (value = "id", required = true) int id,@RequestParam (value = "name", required = true) String name,
//		@RequestParam(value = "age", required = true) int age,ModelMap Student)
//{
//	Student s=new Student(name,age);
//	s.setId(id);
//	sd.updatestudent(s);
//	return "redirect:/foo";
//}
//
//@GetMapping("foo")
//public String foo() {
//	return "Home.jsp";
//}

}
