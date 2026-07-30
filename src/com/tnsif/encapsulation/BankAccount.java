package com.tnsif.encapsulation;

public class BankAccount {
	private String AccountHolder;
	private double Balance;
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
public void deposit(double amount) {
	Balance=Balance + amount;
	
}
public void withdraw(double amount) {
	if(amount<=Balance) {
		Balance=Balance-amount;
	}else {
		System.out.println("Insufficient Balance");
	}
}
}
