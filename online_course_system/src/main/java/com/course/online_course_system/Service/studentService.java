package com.course.online_course_system.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.online_course_system.DAO.StudentDAO;
import com.course.online_course_system.Entity.Student;
import com.course.online_course_system.Entity.VerifiedTeacher;

@Service
public class studentService {
	@Autowired
	private StudentDAO sd;
	public void addstudent(Student s)
	{
		sd.store(s);
	}
	
	public void updatestudent(Student s)
	{
		sd.update(s);
	}
	
	public Student getObjectById(int id) {
		return sd.getObjectById(id);
	}
	
	public int fetch_data(long mobile,String password) {
		return sd.fetch_data(mobile, password);
	}
	
	public Student getByStudentId(int sId) {
		return sd.getByStudentId(sId);
	}
	
}
