package com.tnsif.exceptionhandling;

public class Arithmeticexception {
	public static void main(String[] args) {
		int num1=1052/58;
		System.out.println(num1);
		int num2=105/58;
		System.out.println(num2);
		try {
			int num3=50/0;
			System.out.println(num3);
		}
		catch(ArithmeticException r){
			System.out.println(r);
			
		}
		int num4=51/12;
		System.out.println(num4);
	}

}
