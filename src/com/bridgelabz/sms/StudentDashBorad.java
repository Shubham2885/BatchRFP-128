package com.bridgelabz.sms;

public class StudentDashBorad {

	public static void main(String[] args) {
		Student student = new Student("Shubham", 1234, "IT");
		Student student2 = new Student("Anmol", 1234, "ME");
		Student student3 = new Student("Raj", 1234, "ME");
		Student student4 = new Student("Nitesh", 1254, "BE");
		
		IStudentService iStudentService = new StudentServiceImpl();
		
		iStudentService.addStudent(student);
		iStudentService.addStudent(student2);
		iStudentService.addStudent(student3);
		iStudentService.addStudent(student4);
		
		Student[] students = iStudentService.getAllStudents();
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
	}
}
