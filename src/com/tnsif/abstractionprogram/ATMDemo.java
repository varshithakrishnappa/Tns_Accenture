package com.tnsif.abstractionprogram;

abstract class ATM{
	abstract void withdraw();
	abstract void deposit();
	void display() {
		System.out.println("welcome to Union ATM");
	}
}

class UNIONATM extends ATM{

	@Override
	void withdraw() {
		System.out.println("Money withdraw successfully");
	}

	@Override
	void deposit() {
		System.out.println("money deposit successfully");
	}	
}
public class ATMDemo {
	public static void main(String[] args) {
		UNIONATM u=new UNIONATM();
		u.deposit();
		u.withdraw();
		u.display();
	}
}
