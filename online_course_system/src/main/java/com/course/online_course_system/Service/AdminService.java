package com.course.online_course_system.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.online_course_system.DAO.AdminDAO;
import com.course.online_course_system.DAO.TeacherDAO;
import com.course.online_course_system.Entity.Admin;
import com.course.online_course_system.Entity.Teacher;

@Service
public class AdminService {
	@Autowired
	private AdminDAO sd;
	public void addAdmin(Admin s)
	{
		sd.store_Admin(s);
	}
	public boolean fetchAdmin(long mobile,String password)
	{
		boolean b=sd.fetch_data(mobile, password);
		return b;
	}
	
}
