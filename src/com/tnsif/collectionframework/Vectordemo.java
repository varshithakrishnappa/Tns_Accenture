package com.tnsif.collectionframework;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(5);
		v.addFirst(20);
		v.addLast(100);
		v.addAll(3, v);
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
	}

}
