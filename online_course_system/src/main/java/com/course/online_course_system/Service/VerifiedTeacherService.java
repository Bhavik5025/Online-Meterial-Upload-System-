package com.course.online_course_system.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.online_course_system.DAO.TeacherDAO;
import com.course.online_course_system.DAO.VerifiedTeacherDAO;
import com.course.online_course_system.Entity.Teacher;
import com.course.online_course_system.Entity.VerifiedTeacher;

@Service
public class VerifiedTeacherService {
	@Autowired
	private VerifiedTeacherDAO sd;
	
	public void addTeacher(VerifiedTeacher s)
	{
		sd.store_teacher(s);
	}
	
	public List<VerifiedTeacher> getTeachers() {
		return sd.getTeachers();
	}
	
	public int fetch_data(long mobile,String password) {
		return sd.fetch_data(mobile, password);
	}
	
	public VerifiedTeacher getByTeacherId(int teacherId) {
		return sd.getByTeacherId(teacherId);
	}
}
