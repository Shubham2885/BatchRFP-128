package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bridgelabz.sms.Student;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		
		Iterable<String> iterable = new ArrayList<String>();
		
		Collection<String> collection = new ArrayList<String>();
//		collection.
		
		List<String> strings = new ArrayList<String>();
		
		strings.add("Shubham");
		strings.add("Shubham");
		
		
//		for(int i=0;i<100;i++) {
//			strings.add(""+i);
//		}
		
		System.out.println("List = "+strings);
		
		Set<String> strings2 = new HashSet<String>();
		
		Set<Student> students = new HashSet<Student>();
		List<Student> strings1 = new ArrayList<Student>();
		
		Student student = new Student("Shubham", 1, "Math", 1234);
		Student student1 = new Student("Shubham", 1, "Math", 1234);
		
		System.out.println(student);
		System.out.println(student1);
		students.add(student);
		students.add(student);
		students.add(student1);
		
		strings1.add(student);
		strings1.add(student1);
		strings1.add(student);
		
		System.out.println("strings1 = "+strings1);
		System.out.println(students);
		strings2.add("Shubham");
		strings2.add("Shubham");
		
//		for(int i=0;i<100;i++) {
//			strings2.add(""+i);
//		}
		
		System.out.println("Set = "+strings2);
		
		Map<String, Student> map = new HashMap<String, Student>();
		
		map.put("Shubham", student);
		
		System.out.println(map.get("Shubham"));
		System.out.println(map);
	}
}
