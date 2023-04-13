package com.course.online_course_system.DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
import com.course.online_course_system.Entity.Material;
import com.course.online_course_system.Entity.Student;
import com.course.online_course_system.Entity.Teacher;

import jakarta.persistence.EntityManager;

@Repository
public class MaterilaDao {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public void store_material(Material s)
	{
		Session s1=entityManager.unwrap(Session.class);
	
		s1.persist(s);
	
		s1.close();
	}
	
	public List<Material> getByTeacherId(int teacherId)
	{
		Session s1 = entityManager.unwrap(Session.class);
		
		Query<Material> theQuery =
				s1.createQuery("from Material where teacherId = "+teacherId, Material.class);
		
		List<Material> materials = theQuery.getResultList();
		
		s1.close();
		return materials;
	}
	
	@Transactional
	public void deleteById(int id) {
		Session s1 = entityManager.unwrap(Session.class);
		String hql = "DELETE FROM Material e1 WHERE e1.id = "+id;
		Query query = s1.createQuery(hql);
		query.executeUpdate();
//		Material m = s1.get(Material.class, id);
//		s1.remove(m);
		s1.close();
	}
	
	public List<Material> getMaterials(){
		Session s1 = entityManager.unwrap(Session.class);
		
		Query<Material> theQuery =
				s1.createQuery("from Material", Material.class);
		
		List<Material> materials = theQuery.getResultList();
		
		s1.close();
		return materials;
		
	}
	
	public Material getObjectById(int id) {
		Session s1 = entityManager.unwrap(Session.class);
	    Material s = s1.get(Material.class, id);
	    s1.close();
	    return s;
	    
	}
	
	@Transactional
	public void store(Material m)
	{
		Session s1=entityManager.unwrap(Session.class);
	
		s1.persist(m);
		s1.close();
	}
}
