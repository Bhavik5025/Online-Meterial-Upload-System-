package com.course.online_course_system.DAO;

import java.beans.BeanProperty;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.course.online_course_system.Entity.Student;
import com.course.online_course_system.Entity.VerifiedTeacher;

import jakarta.persistence.EntityManager;







@Repository

public class StudentDAO {
	@Autowired
	EntityManager entityManager;
	
	
	@Transactional
	public void store(Student s)
	{
		Session s1=entityManager.unwrap(Session.class);
	
		s1.persist(s);
	
		s1.close();
	}
	
	@Transactional
	public void update(Student s)
	{
		Session s1=entityManager. unwrap(Session.class);
		s1.merge(s);
		s1.close();
	}
	
	public Student getObjectById(int id) {
		Session s1 = entityManager.unwrap(Session.class);
	    Student s = s1.get(Student.class, id);
	    s1.close();
	    return s;
	    
	}
	
	@Transactional
	public int fetch_data(long mobile,String password)
	{
		Session s1=entityManager.unwrap(Session.class);
		Query<Student> theQuery =
				s1.createQuery("from Student",Student.class);
		
		// execute query and get result list
		List<Student> a=theQuery.getResultList();
		System.out.println(a);
		 for(Student ab:a)
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
	
	public Student getByStudentId(int studentId)
	{
		Session s1 = entityManager.unwrap(Session.class);
		
		Query<Student> theQuery =
				s1.createQuery("from Student where id = "+studentId, Student.class);
		
		Student s = theQuery.getSingleResult();
		
		s1.close();
		return s;
	}
}
