package com.tnsif.inheritenceprogram;

class Engineering{
	void branch() {
		System.out.println("artficial intelligence");
	}
}

class Degree extends Engineering{
	
	void course() {
		System.out.println("bba");
	}
}
class diploma extends Degree{
	void show( ) {
		System.out.println("girl and boys");
	}
}
public class Multileveldemo1 {
public static void main(String[] args) {
	diploma d=new diploma();
	d.branch();
	d.course();
	d.show();
	System.out.println();
	}

	}