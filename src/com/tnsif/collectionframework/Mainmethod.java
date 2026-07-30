package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class Mainmethod {
public static void main(String[] args) {
	
	ArrayList<Employee1> al=new ArrayList<>();
	
	al.add(new Employee1(103,"ravi",452000));
	al.add(new Employee1(104,"anu",450400));
	al.add(new Employee1(1037,"shiva",455000));
	al.add(new Employee1(109,"divya",425000));
	
//	Collections.sort(al);
//	
//	System.out.println("sorted the employee ID:");
//	for(Employee e:al) {
//		System.out.println(e);
//	}
	
	Collections.sort(al, new Namecomparator());
	System.out.println("sorted by name");
	for(Employee1 d:al) {
		System.out.println(d);
	}
	
	Collections.sort(al, new SalaryComparator());
	System.out.println("sorted by name");
	for(Employee1 d1:al) {
		System.out.println(d1);
	}
	
}
}