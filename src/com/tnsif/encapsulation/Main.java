package com.tnsif.encapsulation;

public class Main {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(2005);
		s.setName("Chintu");
		
		System.out.println("Student Id : " +s.getId());
		System.out.println("Student Name : "+s.getName());
	}

}
