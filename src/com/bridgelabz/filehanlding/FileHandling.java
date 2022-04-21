package com.bridgelabz.filehanlding;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import com.bridgelabz.sms.Student;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		
		File textFile = new File("TextFile.txt");
		
		System.out.println(textFile.createNewFile());
		System.out.println(textFile.getAbsolutePath());
		System.out.println(textFile.getName());
		System.out.println(textFile.getTotalSpace());
		
//		System.out.println(textFile.delete());
		
//		String str = "Hi Shubham, This is file handling session";
//		
		PrintStream printStream = new PrintStream(textFile);
		
//		printStream.append(str);
//		
//		String str1 = "Hi Shubham, This is file handling session";
//		
//		printStream.append(str1);
//		System.out.println("Data is inserted...");
		
//		printStream.close();
		
//		Scanner scanner = new Scanner(textFile);
//		
//		System.out.println("Data in File = "+ scanner.nextLine());
//		
//		scanner.close();
		Scanner scanner = new Scanner(System.in);
		for(byte i =0;i<5;i++) {
			System.out.println("Enter name");
			String name =scanner.next();
			System.out.println("Enter rollNo");
			int rollNo = scanner.nextInt();
			System.out.println("Enter Sub");
			String sub = scanner.next();
			System.out.println("Enter year");
			int yr = scanner.nextInt();
			Student student = new Student(name, rollNo, sub, yr);
			
			printStream.append(student.toString());
			printStream.append("\n");
		}
		
		printStream.close();
		
		Scanner scannerForFile = new Scanner(textFile);
		
		System.out.println("Data in file");
		while(scannerForFile.hasNext()) {
			System.out.println(scannerForFile.nextLine());
		}
	}
}
