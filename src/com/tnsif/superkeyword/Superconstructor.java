package com.tnsif.superkeyword;
class Employee1{
	Employee1(){
		System.out.println("welcome to Java");
	}
}
class Developer extends Employee1{
	Developer(){
		super();
		System.out.println("welcome to python");
		}
}
public class Superconstructor {
	public static void main(String[] args) {
		Developer d= new Developer();
	}

}
