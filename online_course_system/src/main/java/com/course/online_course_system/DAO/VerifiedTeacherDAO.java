package com.course.online_course_system.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.course.online_course_system.Entity.Admin;
import com.course.online_course_system.Entity.Material;
import com.course.online_course_system.Entity.Teacher;
import com.course.online_course_system.Entity.VerifiedTeacher;

import jakarta.persistence.EntityManager;

@Repository
public class VerifiedTeacherDAO {

	@Autowired
	EntityManager entityManager;
	
	
	@Transactional
	public void store_teacher(VerifiedTeacher s)
	{
		Session s1=entityManager.unwrap(Session.class);
	
		s1.persist(s);
	
		s1.close();
	}
	
	public List<VerifiedTeacher> getTeachers() {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// create a query
		Query<VerifiedTeacher> theQuery =
				currentSession.createQuery("from VerifiedTeacher",VerifiedTeacher.class);
		
		// execute query and get result list
		List<VerifiedTeacher> teachers = theQuery.getResultList();
		
		currentSession.close();
		return teachers;
	}
	
	@Transactional
	public int fetch_data(long mobile,String password)
	{
		Session s1=entityManager.unwrap(Session.class);
		Query<VerifiedTeacher> theQuery =
				s1.createQuery("from VerifiedTeacher",VerifiedTeacher.class);
		
		// execute query and get result list
		List<VerifiedTeacher> a=theQuery.getResultList();
		System.out.println(a);
		 for(VerifiedTeacher ab:a)
		 {
			 System.out.println(ab.getMobile_no());
			 if(ab.getMobile_no()==mobile && ab.getPassword().equals(password))
			 {
				 System.out.println(ab.getName());
				 return ab.getId();
			 }
		 }
		
		return 0;
		
	}
	
	public VerifiedTeacher getByTeacherId(int teacherId)
	{
		Session s1 = entityManager.unwrap(Session.class);
		
		Query<VerifiedTeacher> theQuery =
				s1.createQuery("from VerifiedTeacher where id = "+teacherId, VerifiedTeacher.class);
		
		VerifiedTeacher s = theQuery.getSingleResult();
		
		s1.close();
		return s;
	}
}
