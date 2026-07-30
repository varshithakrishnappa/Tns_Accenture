package com.tnsif.exceptionhandling;

public class Finaldemo {
	public static void main(String[] args) {
		try {
			System.out.println("welcome to java");
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Beauty");
		}
	}

}
