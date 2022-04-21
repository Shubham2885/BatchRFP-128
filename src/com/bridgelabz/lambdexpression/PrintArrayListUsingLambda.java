package com.bridgelabz.lambdexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class Impl implements Consumer<Integer> {
//	public void accept(Integer num) {
//		System.out.println("Integer = "+num);
//	}
//}

public class PrintArrayListUsingLambda {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(12,3,4,5,6,7,89,34,2,23,54,34,6,5,4,3,23,24,24);
		integers.forEach(num->	System.out.println("Integer = "+num));
	}
}
