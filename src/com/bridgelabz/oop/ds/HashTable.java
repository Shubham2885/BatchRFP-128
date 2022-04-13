package com.bridgelabz.oop.ds;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.sms.Student;

public class HashTable {

	public static void main(String[] args) {
		Student student1 = new Student("Shubham1", 1, "Math1", 1995);
		Student student2 = new Student("Shubham2", 2, "Math2", 1996);
		Student student3 = new Student("Shubham3", 3, "Math3", 1997);
		Student student4 = new Student("Shubham4", 4, "Math4", 1994);
		Student student5 = new Student("Shubham5", 5, "Math5", 1993);
		Student student6 = new Student("Shubham6", 6, "Math5", 1999);
		Student student7 = new Student("Shubham7", 7, "Math6", 1999);
		Student student8 = new Student("Shubham8", 8, "Math7", 1998);
		Student student9 = new Student("Shubham9", 9, "Math8", 1997);
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);
		arrayList.add(student6);
		arrayList.add(student7);
		arrayList.add(student8);
		arrayList.add(student9);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many keys you want...Enter the number");
		int numberOfKey = scanner.nextInt();
		
		System.out.println("numberOfKey = "+numberOfKey);
		

		Object[] objects = new Object[numberOfKey];
		
		for(byte i =0; i<numberOfKey;i++) {
			objects[i] = new ArrayList<Student>();
		}
		
		for(byte i =0; i<arrayList.size();i++) {
			Student student = arrayList.get(i);
			int key = student.getYearOfBirth() % numberOfKey;
			ArrayList<Student> list = (ArrayList<Student>) objects[key];
			list.add(student);
		}
		
		
		for(byte i =0; i<numberOfKey;i++) {
			ArrayList<Student> list = (ArrayList<Student>) objects[i];
			System.out.println("Key = 199"+ i+ " Values = "+list);
		}
	}
}
