package com.course.online_course_system.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private long mobile_no;
	@Column
	private String Password;
	public String getName() {
		return name;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String name, long mobile_no, String password) {
		super();
		this.name = name;
		this.mobile_no = mobile_no;
		Password = password;
	}
	public void setName(String name) {
		this.name = name;
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
}
