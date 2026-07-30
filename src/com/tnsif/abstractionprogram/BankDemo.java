package com.tnsif.abstractionprogram;
abstract class BankAccount{
	double balance=1000;
	
	//abstract methods
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
	//normal method
	void displayinfo() {
		System.out.println("current balance"+balance);
	}
}
//child class
class SavingAccount extends BankAccount{

	@Override
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println(amount+" : deposited");
	}

	@Override
	void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount + " withdraw succesfully");
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
}
public class BankDemo {
	public static void main(String[] args) {
		SavingAccount s= new SavingAccount();
		s.displayinfo();
		s.deposit(30000);
		s.withdraw(5200);
		s.displayinfo();
		
		
	}

}
