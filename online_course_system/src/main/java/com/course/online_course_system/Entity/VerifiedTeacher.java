package com.course.online_course_system.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class VerifiedTeacher {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String qualification;
	@Column
	private long mobile_no;
	@Column
	private String Password;
	
	public VerifiedTeacher(int id, String name, String qualification, long mobile_no, String password) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.mobile_no = mobile_no;
		Password = password;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
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
	@Override
	public String toString() {
		return "VerifiedTeacher [id=" + id + ", name=" + name + ", qualification=" + qualification + ", mobile_no="
				+ mobile_no + ", Password=" + Password + "]";
	}

	public VerifiedTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
