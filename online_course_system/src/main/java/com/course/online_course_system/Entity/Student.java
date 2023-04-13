package com.course.online_course_system.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column
private int id;
@Column
private String name;
@Column
private int age;
@Column
private long mobile_no;
@Column
private String Password;

@ManyToMany
@JoinTable(name = "StudentMaterial")
@JoinColumn(name =
"studentId",
referencedColumnName = "studentId")
@JoinColumn(name =
"materialId", referencedColumnName =
"materialId")
List<Material> materials;

public List<Material> getMaterials() {
	return materials;
}

public void setMaterials(List<Material> materials) {
	this.materials = materials;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getMobile_no() {
	return mobile_no;
}

public void setMobile_no(long mobile_no) {
	this.mobile_no = mobile_no;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public Student(String name, int age, long mobile_no, String password) {
	super();
	this.name = name;
	this.age = age;
	this.mobile_no = mobile_no;
	Password = password;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
}
