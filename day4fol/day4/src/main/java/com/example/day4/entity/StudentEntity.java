package com.example.day4.entity;




import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Studentsdetails")
public class StudentEntity 
{		@Id
	private int id;
	private String studentName;
	private String departmentName;
	private String mailid;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}



	public String getMailid() {
		return mailid;
	}



	public void setMailid(String mailid) {
		this.mailid = mailid;
	}



	public StudentEntity(int id, String studentName, String departmentName, String mailid) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.mailid = mailid;
	}



	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}