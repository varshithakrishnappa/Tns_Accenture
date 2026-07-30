package com.tnsif.scannerclassprograms;

import java.util.Scanner;

public class Product {
	int productid;
	String pname;
	Double price;
	void display() {
		System.out.println("-----Product Details------");
		System.out.println("Product Id : "+ productid);
		System.out.println("Product Name : "+pname);
		System.out.println("Price : "+price);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Product p=new Product();
			System.out.println("Enter the ProductId");
			p.productid=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Product Name");
			p.pname=sc.next();
			
			System.out.println("Enter Price ");
			p.price=sc.nextDouble();
			
			p.display();
		}
		
	}

}
