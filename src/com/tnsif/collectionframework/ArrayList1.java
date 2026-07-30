package com.tnsif.collectionframework;
import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {
	public static void main(String[] args) {
		List<String> f=new ArrayList<String>();	
		f.add("apple");
		f.add("watermelon");
		f.add("apple");
		f.add("grapes");
		f.add("mango");
		System.out.println(f);
		f.set(1, "cherry");
		System.out.println(f);
	
	
	
	
	}

}
