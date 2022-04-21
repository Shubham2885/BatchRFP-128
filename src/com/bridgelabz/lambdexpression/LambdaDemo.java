package com.bridgelabz.lambdexpression;

@FunctionalInterface
interface ABC {
	public void print();
}

@FunctionalInterface
interface ABC1 {
	public void print(String name);
}

@FunctionalInterface
interface ABC2 {
	public void print(String fname, int lname);
}

interface ABC3 {
	public boolean checkEven(int number);
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		// (praramenters) -> {};
		
		ABC abc = () -> System.out.println("Print method");
		ABC1 abc1 = name -> System.out.println("welcome "+name);
		ABC2 abc2 = (fname, lname) -> System.out.println("welcome "+fname+" "+lname);
		
		ABC3 abc3 = (num) -> num%2 == 0;
		
		abc.print();
		abc1.print("Shubham");
		abc2.print("Shubham", 3);
		
		System.out.println(abc3.checkEven(5));
	}
}
