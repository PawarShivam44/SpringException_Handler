package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer eId;
	@Column
	private String eName;
	@Column
	private int age;
	@Column
	private String eEmail;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", age=" + age + ", eEmail=" + eEmail + "]";
	}

	public Employee(int eId, String eName, int age, String eEmail) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.age = age;
		this.eEmail = eEmail;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
