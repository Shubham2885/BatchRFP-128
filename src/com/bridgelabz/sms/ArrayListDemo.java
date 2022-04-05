package com.bridgelabz.sms;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Shubham");
		arrayList.add("Rahul");
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(31);
		
		System.out.println(arrayList1);
		System.out.println(arrayList1.contains(31));
		
		for(Integer str : arrayList1) {
			System.out.println(str);
		}
		
		//12,"Shubham",8.6, false
		
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(12);
		arrayList2.add("Shdsjsdf");
		
		int x = 5;
		Integer integer = new Integer(x);
		
		//wrapper class
		//Integer for int
		//Float for float
		//Byte for byte
		//Short for short
		//Double for double
		//Boolean for boolean
		
	}
}
