package com.bridgelabz.oops;

//exmaple of default
//default = access the instance variable and method and also class  within same package only
/*
class Student {

	//instance variable
	int rollNo;
	
	//instance method
	int getRollNo() {
		return rollNo;
	}
}
*/

//exmaple of public
//public  = access the instance variable and method and also class  through out project
/*
public class Student {

	//instance variable
	public int rollNo;
	
	//instance method
	public int getRollNo() {
		return rollNo;
	}
}
*/

//exmaple of private
//private  = you cannot access the instance variable and method  outside this class

public class Student {

	//instance variable
	private int rollNo;

	//instance method
	public int getRollNo() {
		return rollNo;
	}

	//instance method
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
/*
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getRollNo());
		student.setRollNo(7);
		System.out.println(student.getRollNo());
	}
}
*/

//access Modifier 4
//default = access the instance variable and method within same package only
//public
//private
//protected