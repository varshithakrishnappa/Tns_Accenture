package com.tnsif.exceptionhandling;

public class Nullpointerdemo {
	public static void main(String[] args) {
		String customer=null;
		try {
			System.out.println(customer.length());
		}
		catch(NullPointerException h){
			System.out.println(h);
			
		}
	}

}
