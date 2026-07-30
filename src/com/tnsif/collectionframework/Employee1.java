package com.tnsif.collectionframework;

public class Employee1 {
	int id;
	String name;
	double salary;
	
	//parameter
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}