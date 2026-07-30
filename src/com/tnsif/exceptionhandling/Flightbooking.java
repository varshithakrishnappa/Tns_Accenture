package com.tnsif.exceptionhandling;

public class Flightbooking {
	static void checkpassport(boolean passport) throws Exception{
		if(!passport) {
			throw new Exception("passport required for travel");
		}
		System.out.println("bording allowed");
	}
public static void main(String[] args) {
		try {
			checkpassport(true);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
