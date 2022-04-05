package com.bridgelabz.oops1;

public class GenericClass <E> {

	E e1;
	E e2;
	E e3;
	
	public <T extends Comparable<T>> void findGreater(T t1, T t2, T t3) {
		
		if(t1.compareTo(t2) > 0 && t1.compareTo(t3) > 0 ) {
			System.out.println("T1 is greater = "+ t1);
		}else if(t2.compareTo(t1) > 0 && t2.compareTo(t3) > 0) {
			System.out.println("T2 is greater = "+ t2);
		}else {
			System.out.println("T3 is greater = "+ t3);
		}
	}
	
	
	public static void main(String[] args) {
		GenericClass genericClass = new GenericClass();
		genericClass.e1 = "sdlfjk";
		
		genericClass.e1 = 12345;
		
		genericClass.findGreater("D", "]", "B");
	}
}
