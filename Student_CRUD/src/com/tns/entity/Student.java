package com.tns.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int stud_id;
	
	private String stud_name;

	public int getStudentid() {
		return stud_id;
	}

	public void setStudentid(int studentid) {
		this.stud_id = studentid;
	}

	public String getName() {
		return stud_name;
	}

	public void setName(String name) {
		this.stud_name = name;
	}

}