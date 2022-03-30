package com.bridgelabz.sms;

public class Student {

	private String name;
	private int rollNo;
	private String sub;

	public Student() {
		
	}
	
	public Student(String name, int rollNo, String sub) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.sub = sub;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", sub=" + sub + "]";
	}
	
	
}
