package com.bridgelabz.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

//	@Override
//	public boolean test(Integer t) {
//		if(t % 2 == 0)
//			return true;
//		return false;
//	}

	public static void main(String[] args) {
		
//		Predicate<Integer> predicate = (Integer t) -> {
//			if(t % 2 == 0)
//				return true;
//			return false;
//		};
		
//		Predicate<Integer> predicate =  t -> t % 2 == 0;
		
//		System.out.println(predicate.test(5));
		
		List<Integer> integers = Arrays.asList(12,3,4,5,6,7,89,34,2,23,54,34,6,5,4,3,23,24,24);
		
		List<Integer> resultList = integers.stream().filter(t -> t % 2 == 0).sorted((t1, t2) -> t2.compareTo(t1)).collect(Collectors.toList());
		
		resultList.stream().forEach(t->System.out.println("Print = "+t));
		
		System.out.println(integers.stream()
				.filter(t -> t % 2 == 0)
				.map(Integer::intValue).reduce(0,(sum, data) -> sum + data));
		
		System.out.println(integers.stream().filter(t -> t % 2 == 0).reduce(0,(sum, data) -> sum + data));
	}
}
