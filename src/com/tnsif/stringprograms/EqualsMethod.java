package com.tnsif.stringprograms;

public class EqualsMethod {
	public static void main(String[] args) {
		String Storedname="chintu";
		String entername1="chintu";
		String entername2=new String("chintu");
		String entername3="Rocky";
		String entername4="CHINTU";
		System.out.println(Storedname.equals(entername1));
		System.out.println(Storedname.equals(entername2));
		System.out.println(Storedname.equals(entername3));
		System.out.println(Storedname.equals(entername1));
		System.out.println(Storedname.equalsIgnoreCase(entername4));
		System.out.println(Storedname.equalsIgnoreCase(entername3));
	}

}
