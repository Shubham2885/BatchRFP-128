package com.bridgelabz.sms;

import java.util.ArrayList;

import com.bridgelabz.oop.ds.LinkedList;

public class StudentServiceImpl implements IStudentService {

	//private Student[] array = new Student[10];
	private ArrayList<Student> students = new ArrayList<Student>();
	
//	@Override
//	public Student[] getAllStudents() {
//		return array;
//	}
	
	@Override
	public ArrayList<Student> getAllStudents() {
		return students;
	}

//	@Override
//	public void addStudent(Student student) {
//		student.setRollNo(5555);
//		for(int i=0;i<array.length;i++) {
//			Student student2 = array[i];
//			if(student2 == null) {
//				array[i] = student;
//				break;
//			}
//		}
//	}
	
	@Override
	public void addStudent(Student student) {
		students.add(student);
	}
	
}
