package com.tnsif.collectionframework;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<String> books=new Stack<String>();
		books.push("Java");
		books.push("React");
		books.push("Nodejs");
		books.push("Python");
		books.push("Java");
		System.out.println(books);
		
		//peek()
		System.out.println("top book " + books.peek());
 		
		//search()
		System.out.println(books.search("React"));
		
		//pop()
		System.out.println(books.pop());
		System.out.println(books.size());

	}

}
