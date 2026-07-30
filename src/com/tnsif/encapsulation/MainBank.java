package com.tnsif.encapsulation;

public class MainBank {
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.setAccountHolder("Manjula R");
		b.deposit(100000);
		b.withdraw(5000);
		System.out.println("AccountHolder : " + b.getAccountHolder());
		System.out.println("Balance : "+b.getBalance());
	}

}
