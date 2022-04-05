package com.bridgelabz.oop.ds;

import com.bridgelabz.sms.Student;

public class Demo {

	public static void main(String[] args) {
		
		Student student = new Student("Shubham", 1234, "IT");
		Student student2 = new Student("Anmol", 1234, "ME");
		Student student3 = new Student("Raj", 1234, "ME");
		Student student4 = new Student("Nitesh", 1254, "BE");
		
		LinkedList.add(student);
		LinkedList.add(student2);
		LinkedList.add(student3);
		LinkedList.add(student4);
		
		LinkedList.printList();
	}
}
