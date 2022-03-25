package com.bridgelabz.oops;

class MathOperation {
	private int x,y;
	
	//paramenterize const
	public MathOperation(int m, int n) {
		x = m;
		y = n;
	}
	
	public MathOperation(int m) {
		x = m;
	}
	
	public MathOperation() {
		x = 1;
		y = 1;
	}
	
	public int addtion() {
		return x+y;
	}
	
	public int sub() {
		return x-y;
	}
	
	public int mul() {
		return x*y;
	}
	
	public int div() {
		return x/y;
	}
	
	public int mod() {
		return x%y;
	}
	
	public int sqrt() {
		return x*x;
	}
}
public class ConstuctorDemo {

	public static void main(String[] args) {
		MathOperation mathOperation = new MathOperation();
		System.out.println("mathOperation result = "+mathOperation.addtion());
		MathOperation mathOperation2 = new MathOperation(7, 8);
		System.out.println("mathOperation2 result = "+mathOperation2.addtion());
		
		MathOperation mathOperation3 = new MathOperation(10);
		System.out.println("mathOperation3 result = "+mathOperation3.sqrt());
	}
}
//when constructor invoke(call) then it will initialize the instance variable
//name of constructor should same as class name

//there 3 types of constructor
//1 - default constructor
//2 - Parameterize constructor
//3 - copy constructor