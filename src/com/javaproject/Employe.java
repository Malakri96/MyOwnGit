package com.javaproject;

import java.io.Serializable;

public class Employe implements Serializable {
	String empName;
	String empNum;
	int id;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	  @Override public String toString() { return  "Employe [empName=" +
	  empName + ", empNum=" + empNum + ", id=" + id + "]"; }
	 
	

}
