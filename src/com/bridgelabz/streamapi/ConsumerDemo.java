package com.bridgelabz.streamapi;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Print = "+t);
//	}
	
	public static void main(String[] args) {
		
//		Consumer<Integer> consumer = t -> System.out.println("Print = "+t);
		
//		consumer.accept(3);
		
		List<Integer> integers = Arrays.asList(12,3,4,5,6,7,89,34,2,23,54,34,6,5,4,3,23,24,24);
		
//		for(Integer integer : integers) {
//			consumer.accept(integer);
//		}
		
		integers.stream().forEach(t -> System.out.println("Print = "+t));
		
	}

}
