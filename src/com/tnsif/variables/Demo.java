package com.tnsif.variables;
//demo for object creation
public class Demo {
	String name;//declaration
	int price;
	void display() { //method
		System.out.println("Food name : " + name);
		System.out.println("Food price : "+price);
	}
	public static void main(String[] args) {
		//create object
		Demo d1=new Demo();
		d1.name="Masala Dosa";
		d1.price=90;
		
		Demo d2=new Demo();
		d2.name="Idli";
		d2.price=50;
		
		d1.display(); //method call
		d2.display();
	}

}
