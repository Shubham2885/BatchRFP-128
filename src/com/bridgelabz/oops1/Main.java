package com.bridgelabz.oops1;

import com.bridgelabz.oops.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getRollNo());
		student.setRollNo(7);
		System.out.println(student.getRollNo());
	}
}
