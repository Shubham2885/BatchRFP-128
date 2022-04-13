package com.bridgelabz.exceptionhandling;

import java.io.File;
import java.util.Scanner;

import com.bridgelabz.sms.Student;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		int result = 0;
		try {
			result = num1 / num2;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Cannot divided by 0");
			result = 0;
		}finally {
			System.out.println("Finally block runs");
			scanner.close();
		}
		
		File file = new File("Text.txt");
			
		
		String str = "12345";
		
//		Student student = null;
//		
//		student.setName("Shubham");
		
//		System.out.println(str.charAt(7));
		
		System.out.println("Result : "+result);
	}
}
