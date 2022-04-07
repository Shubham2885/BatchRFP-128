package com.bridgelabz.oop.ds;

import java.util.ArrayList;
import java.util.Scanner;

public class HashTableDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello Hash Table");
		
		int input[] = {12,34,5,4,7,3,4,6,67,8,86,4,4,53,3,54,3,345,6,56,57,3,2,34};
		
		System.out.println("Input Data");
		for(byte i =0; i<input.length;i++) {
			System.out.print(input[i]+", ");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many keys you want...Enter the number");
		int numberOfKey = scanner.nextInt();
		
		System.out.println("numberOfKey = "+numberOfKey);
		

		Object[] objects = new Object[numberOfKey];
		
		for(byte i =0; i<numberOfKey;i++) {
			objects[i] = new ArrayList<Integer>();
		}
		
		for(byte i =0; i<input.length;i++) {
			int key = input[i] % numberOfKey;
			ArrayList<Integer> list = (ArrayList<Integer>) objects[key];
			list.add(input[i]);
		}
		
		
		for(byte i =0; i<numberOfKey;i++) {
			ArrayList<Integer> list = (ArrayList<Integer>) objects[i];
			System.out.println("Key = "+ i+ " Values = "+list);
		}
		
		
	}
}
