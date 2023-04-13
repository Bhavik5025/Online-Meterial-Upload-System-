package com.course.online_course_system.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.course.online_course_system.Entity.Admin;
import com.course.online_course_system.Entity.Teacher;

import jakarta.persistence.EntityManager;


@Repository

public class AdminDAO {
	@Autowired
	EntityManager entityManager;
	
	
	@Transactional
	public void store_Admin(Admin s)
	{
		Session s1=entityManager.unwrap(Session.class);
	
		s1.persist(s);
	
		s1.close();
	}
	
	@Transactional
	public boolean fetch_data(long mobile,String password)
	{
		Session s1=entityManager.unwrap(Session.class);
		Query<Admin> theQuery =
				s1.createQuery("from Admin",Admin.class);
		
		// execute query and get result list
		List<Admin> a=theQuery.getResultList();
		System.out.println(a);
		 for(Admin ab:a)
		 {
			 System.out.println(ab.getMobile_no());
			 if(ab.getMobile_no()==mobile && ab.getPassword().equals(password))
			 {
				 System.out.println(ab.getName());
				 return true;
			 }
		 }
		
		return false;
		
	}
//	@Transactional
//	public void update_teacher(Teacher s)
//	{
//		Session s1=entityManager. unwrap(Session.class);
//		s1.merge(s);
//		s1.close();
//	}
//	
//	public Teacher getObjectById(int id) {
//		Session s1 = entityManager.unwrap(Session.class);
//	    Teacher s = s1.get(Teacher.class, id);
//	    s1.close();
//	    return s;
//	    
//	}
}
