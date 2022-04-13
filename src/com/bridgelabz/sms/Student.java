package com.bridgelabz.sms;

public class Student {

	private String name;
	private int rollNo;
	private String sub;
	private int yearOfBirth;
	
	public Student() {
		
	}
	
	public Student(String name, int rollNo, String sub, int yearOfBirth) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.sub = sub;
		this.yearOfBirth = yearOfBirth;
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
		return "Student [name=" + name + ", rollNo=" + rollNo + ", sub=" + sub + ", yearOfBirth=" + yearOfBirth + "]";
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	
}
