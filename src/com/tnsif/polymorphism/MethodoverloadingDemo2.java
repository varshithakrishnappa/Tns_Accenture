package com.tnsif.polymorphism;
class Calculator2{
	void sub(int a,int b) {
		System.out.println("diff = " + (a-b));
	}
	void sub(int a,int b,int c) {
		System.out.println("diff = " + (a-b-c));
	}
	void sub(double a,double b) {
		System.out.println("diff = " + (a-b));
	}
}

public class MethodoverloadingDemo2 {
	public static void main(String[] args) {
		Calculator2 c=new Calculator2();
		c.sub(100, 200);
		c.sub(25.05, 56.40);
		c.sub(10, 563, 1245);
	}
}