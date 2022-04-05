package com.bridgelabz.oops1;

public class GenericDemo {
	
	
	public static <T> void printData(T data){
		System.out.println(data);
	}

	public static void main(String[] args) {
		
		GenericDemo.printData("Shubham");
		GenericDemo.printData(234234);
	}
}
