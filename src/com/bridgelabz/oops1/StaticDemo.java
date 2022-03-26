package com.bridgelabz.oops1;

class A {
	static int x;
	 int y;
	public A(int a) {
		x++;
		y = a;
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		A aa = new A(10);
		
		System.out.println("x = "+aa.x);
		System.out.println("y = "+aa.y);
		
		A aaa = new A(100);
		System.out.println("x = "+aaa.x);
		System.out.println("y = "+aaa.y);
		
		A aaaa = new A(1000);
		System.out.println("x = "+aaaa.x);
		System.out.println("y = "+aaaa.y);
		
		A sss = aaaa;
		
		System.out.println("****************************************");
		System.out.println("x = "+aa.x);
		System.out.println("y = "+aa.y);
		System.out.println("x = "+aaa.x);
		System.out.println("y = "+aaa.y);
		System.out.println("x = "+aaaa.x);
		System.out.println("y = "+aaaa.y);
		System.out.println("x = "+sss.x);
		System.out.println("y = "+sss.y);
		
		System.out.println("****************************************");
		
		sss.y = 9999;
		System.out.println("aaaa.y = "+aaaa.y);
		System.out.println("sss.y = "+sss.y);
	}
}
