package com.tnsif.superkeyword;
class Company{
	void work() {
		System.out.println("employee is working!");
	}
}
class Coworkingspace extends Company{
	void work() {
		System.out.println("Trainer is teaching Java");
		
	}
	void display() {
		super.work();
		work();
	}
}
public class SuperMethoddemo {
	public static void main(String[] args) {
		Coworkingspace c=new Coworkingspace();
		c.display();
	}

}
