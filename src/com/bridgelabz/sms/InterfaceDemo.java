package com.bridgelabz.sms;

interface IDemo {
	public void printMyName(String name);
}

interface IDemo2{
	public void printMyFull(String name);
}

class DemoImpl implements IDemo, IDemo2 {

	@Override
	public void printMyName(String name) {
		System.out.println("Welcome "+name);
	}

	@Override
	public void printMyFull(String fullName) {
		System.out.println("My Full Name "+fullName);
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		IDemo demo = new DemoImpl();
		IDemo2 demo2 = new DemoImpl();
		demo.printMyName("Shubham");
		demo2.printMyFull("Shubham M Chavan");
		
	}
}
