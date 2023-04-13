package com.course.online_course_system.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Material {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column
	private int id;
	
	@Column
	private int teacherId;
	
	@Column
	private String materialName;
	
	@Column
	private String link;
	
	@ManyToMany(mappedBy="materials")
	List<Student> students;


	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Material(int id, int teacherId, String materialName, String link) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.materialName = materialName;
		this.link = link;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", teacherId=" + teacherId + ", materialName=" + materialName + ", link=" + link
				+ "]";
	}
}
