package com.course.online_course_system.DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.course.online_course_system.Entity.Teacher;

import jakarta.persistence.EntityManager;
@Repository
public class TeacherDAO {
	@Autowired
	EntityManager entityManager;
	
	
	@Transactional
	public void store_teacher(Teacher s)
	{
		Session s1=entityManager.unwrap(Session.class);
	
		s1.persist(s);
	
		s1.close();
	}
	
	@Transactional
	public void update_teacher(Teacher s)
	{
		Session s1=entityManager. unwrap(Session.class);
		s1.merge(s);
		s1.close();
	}
	
	public Teacher getObjectById(int id) {
		Session s1 = entityManager.unwrap(Session.class);
	    Teacher s = s1.get(Teacher.class, id);
	    s1.close();
	    return s;
	    
	}
	
	@Transactional
	public void deleteTeacher(int id) {
		Session s1 = entityManager.unwrap(Session.class);
		Teacher s = s1.get(Teacher.class, id);
		s1.remove(s);
		s1.close();
	}
	
	public List<Teacher> getTeachers() {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// create a query
		Query<Teacher> theQuery =
				currentSession.createQuery("from Teacher", Teacher.class);
		
		// execute query and get result list
		List<Teacher> teachers = theQuery.getResultList();
		
		currentSession.close();
		return teachers;
	}
	
	
}
