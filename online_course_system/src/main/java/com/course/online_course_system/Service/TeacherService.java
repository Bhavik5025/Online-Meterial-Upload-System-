package com.course.online_course_system.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;

import com.course.online_course_system.DAO.TeacherDAO;

import com.course.online_course_system.Entity.Teacher;
@Service
public class TeacherService {
	@Autowired
	private TeacherDAO sd;
	public void addTeacher(Teacher s)
	{
		sd.store_teacher(s);
	}
	
	public void updateTeacher(Teacher s)
	{
		sd.update_teacher(s);
	}
	
	public Teacher getObjectById(int id) {
		return sd.getObjectById(id);
	}
	
	public List<Teacher> getTeachers(){
		return sd.getTeachers();
	}
	
	public void deleteTeacher(int id) {
		sd.deleteTeacher(id);
	}
	
}
