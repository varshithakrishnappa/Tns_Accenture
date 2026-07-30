package com.tnsif.exceptionhandling;

public class Multiplecatchblock {
	public static void main(String[] args) {
		String s="vars";
		try {
			System.out.println(s.charAt(7));
		}
		catch(ArrayIndexOutOfBoundsException h) {
			System.out.println(h);
		}
		catch(ArithmeticException k){
			System.out.println(k);
			
		}
		catch(StringIndexOutOfBoundsException t) {
			System.out.println(t);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
