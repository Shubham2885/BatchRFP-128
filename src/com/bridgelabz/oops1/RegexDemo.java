package com.bridgelabz.oops1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter the mobile");
		String input = scanner.next();
		String regex = "^{1}[6-9]+[0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		
	    Matcher matcher = pattern.matcher(input);
	    
	    if(matcher.find()) {
	      System.out.println("Mobile is valid");
	    } else {
	      System.out.println("Mobile is invalid");
	    }
	}
}
