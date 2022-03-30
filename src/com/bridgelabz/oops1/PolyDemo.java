package com.bridgelabz.oops1;

import java.util.Scanner;

class Printer {
	
	public void printing(String xlxs) {
		
	}
	
	public void printing(String xlxs, int photos) {
		
	}
	
	public void printing(String xlxs, String xlx) {
		
	}
	
	public int printing(int docs) {
		return 0;
	}
	
	public double printing(double photos) {
		return 0.0;
	}
	
	public void printing(String doc1, String pdf, int photos) {
		String result = doc1+pdf+photos;
		System.out.println("printing = "+result);
	}
}

class PrinterMachine extends Printer {
	@Override
	public void printing(String doc1, String pdf, int photos) {
		String result = doc1+"*****"+pdf+"******"+photos;
		System.out.println("printing baner = "+result);
	}
}
//poly = many
// morphism = form
// with different parameter
//or number of parameter(different Signature)
//it's not depend on return type
// two type 1- compile time and 2 run time
// compile time polymorphism called as Method Overloading
//run time polymorphism called as Method Overriding
public class PolyDemo {

	public static void main(String[] args) {
		Printer printer = new PrinterMachine();
		printer.printing("doc1", "pdf", 1);
		Scanner scanner = new Scanner(System.in);
	}
}
