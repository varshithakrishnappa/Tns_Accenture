package com.tnsif.scannerclassprograms;

import java.util.Scanner;

public class Employee {
	int empId;
	String Empname;
	double salary;
	void display() {
		System.out.println("----------Employee Details---------- ");
		System.out.println("Employee Id : " + empId);
		System.out.println("EmpName : " +Empname);
		System.out.println("Salary : "+ salary);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Employee e=new Employee();
			System.out.println("Enter the Id");
			e.empId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name");
			e.Empname=sc.next();
			System.out.println("Enter Employee salary");
			e.salary=sc.nextDouble();
			e.display();
		}
	}

}
