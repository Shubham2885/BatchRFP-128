package com.bridgelabz.oops1;


//super class/ parent/ 
class Parent {
	
	//properties
	private byte height;
	private String surname;
	
	
	public byte getHeight() {
		return height;
	}
	public void setHeight(byte height) {
		this.height = height;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	//behaviours
	public void doingBusiness() {
		System.out.println();
	}
}


class Child extends Parent {
	
	public void runCompany() {
		
	}
	
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		child.doingBusiness();
		child.runCompany();
	}
}
