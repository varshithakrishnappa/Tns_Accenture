package com.tnsif.exceptionhandling;
// demo for throw keyword

public class Throwdemo {
	
	public static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligiable for vote");
		}
		System.out.println("eligiable for vote");
	}
	public static void main(String[] args) {
		try {
			checkAge(8);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
