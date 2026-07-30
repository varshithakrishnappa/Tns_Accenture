package com.tnsif.collectionframework;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<>();
		al.add("Nandini Layout");
		al.add("JP nagar");
		al.add("ML Layout");
		
		al.addFirst("Nelmangala");
		al.addLast("MG Road");
		
		al.offer("attibele");
		System.out.println(al);
		al.removeLast();
		System.out.println(al);
		
	}

}
