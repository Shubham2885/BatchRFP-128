package com.bridgelabz.streamapi;

import java.util.function.Supplier;

public class SupplierDemo {
//
//	@Override
//	public String get() {
//		return "Hi Shubham";
//	}
	
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hi Shubham";
		
		System.out.println(supplier.get());
	}

}
