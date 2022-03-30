package com.bridgelabz.oops1;


//it's example of Encapsulation
class Car {
	//properties/datamembers
	private byte noOfWeel;
	private String brand;
	private String color;
	private byte strock;
	
	//behaviour 
	public void applyingBreak() {
		
	}
	
	public void handlingStearing() {
		
	}
	
	public void accelaration() {
		
	}
	
//	public static void main(String[] args) {
//		System.out.println("Car");
//	}
}

class Medician {
	protected String xContent;
	private String yContent;
	private String zContent;
	
	public Medician(String xContent1, String yContent1, String zContent1) {
		this.xContent = xContent1;
		yContent = yContent1;
		zContent = zContent1;
		System.out.println("Medician Constructor");
	}

	public void reduceFever() {
		System.out.println("Applying these content = "+xContent+" + "+yContent+" + "+zContent);
		System.out.println("after desolve these content, it will reduce the fever");
	}
}

class Mankind extends Medician {
	public Mankind(String xContent, String yContent, String zContent) {
		super(xContent, yContent, zContent);
		System.out.println("Mankind Constructor");
		System.out.println("Show ="+this.xContent);
	}
}

class Mankind2 extends Mankind {
	public Mankind2(String xContent, String yContent, String zContent) {
		super(xContent, yContent, zContent);
		System.out.println("Mankind2 Constructor");
		System.out.println("Mankind2 ="+this.xContent);
	}
}

class Ramdev extends Medician {

	public Ramdev(String xContent, String yContent, String zContent) {
		super(xContent, yContent, zContent);
	}
}

class Patanjali extends Medician  {
	
	public Patanjali(String xContent, String yContent, String zContent) {
		super(xContent, yContent, zContent);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Mankind2 mankind2 = new Mankind2("H2O","O2","SO4");
		mankind2.reduceFever();
		mankind2.xContent = "sdf";
		mankind2.reduceFever();
	}
}
