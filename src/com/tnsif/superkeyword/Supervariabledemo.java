package com.tnsif.superkeyword;


class Employee{
	String name="Rahul";
}
class Trainer extends Employee{
	String name="suresh";

void display() {
	System.out.println("child name : " +name);
	System.out.println("parent name :" + super.name);
}
}
public class Supervariabledemo {
	public static void main(String[] args) {
		Trainer t=new Trainer();
		t.display();
	}
	

}
