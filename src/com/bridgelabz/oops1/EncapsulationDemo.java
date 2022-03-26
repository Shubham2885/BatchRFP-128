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
	
	public static void main(String[] args) {
		System.out.println("Car");
	}
}

class Medician {
	private String xContent;
	private String yContent;
	private String zContent;
	
	public Medician(String xContent, String yContent, String zContent) {
		this.xContent = xContent;
		this.yContent = yContent;
		this.zContent = zContent;
	}

	public void reduceFever() {
		System.out.println("Applying these content = "+xContent+" + "+yContent+" + "+zContent);
		System.out.println("after desolve these content, it will reduce the fever");
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Medician medician = new Medician("H2O","O2","SO4");
		medician.reduceFever();
	}
}
