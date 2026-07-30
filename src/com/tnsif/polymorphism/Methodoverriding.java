package com.tnsif.polymorphism;
class payment{
	void pay() {
		System.out.println("processing payment");
		
	}
}
class Creditcard extends payment{
	@Override
	void pay() {
		System.out.println("payment done from credit card");
	}
}
public class Methodoverriding {
	public static void main(String[] args) {
		Creditcard c=new Creditcard();
		c.pay();
	}

}
