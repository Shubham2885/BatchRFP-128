package com.bridgelabz.sms;

public class StudentServiceImpl implements IStudentService {

	private Student[] array = new Student[10];
	
	@Override
	public Student[] getAllStudents() {
		return array;
	}

	@Override
	public void addStudent(Student student) {
		for(int i=0;i<array.length;i++) {
			Student student2 = array[i];
			if(student2 == null) {
				array[i] = student;
				break;
			}
		}
	}
	
}
