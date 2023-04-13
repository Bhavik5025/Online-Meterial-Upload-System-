package com.course.online_course_system.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.online_course_system.DAO.MaterilaDao;
import com.course.online_course_system.Entity.Material;
//import com.course.online_course_system.DAO.TeacherDAO;
//import com.course.online_course_system.Entity.Teacher

@Service
public class MaterialService {

	@Autowired
	private MaterilaDao md;
	
	public void store_material(Material s) {
		md.store_material(s);
	}
	
	public List<Material> getByTeacherId(int teacherId){
		return md.getByTeacherId(teacherId);
	}
	
	public void deleteById(int id) {
		md.deleteById(id);
	}
	
	public List<Material> getMaterials(){
		return md.getMaterials();
	}
	
	public Material getObjectById(int id) {
		return md.getObjectById(id);
	}
	
	public void store(Material m) {
		md.store(m);
	}
}
