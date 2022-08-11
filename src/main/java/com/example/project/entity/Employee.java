package com.example.project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@Column(name = "id")
	private int eid;
	
	@Column(name = "name")
	private String ename;
	
	@Column(name = "department")
	private String department;
	
	@OneToOne(cascade = CascadeType.ALL)
	
	private Country cid;

	public Employee(int eid, String ename, String department, Country cid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
		this.cid = cid;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + ", cid=" + cid + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Country getCid() {
		return cid;
	}

	public void setCid(Country cid) {
		this.cid = cid;
	}
	
	
	

}
