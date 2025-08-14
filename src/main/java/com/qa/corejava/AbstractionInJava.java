package com.qa.corejava;
// abstract class can have abstract and non abstract methods

// it can have constructor, abstract class must be declared with abstract keyword
// abstract class can have static methods and final methods which will force the subclass not to change the body of the method

abstract class RBI{
	String accoountName;
	double balance;

//constructor
	public RBI(String accountName, double balance) {
		this.accoountName = accountName;
		this.balance = balance;
	}

	// abstract
	public abstract void withdraw(double amount);

// non abstract
	public void deposit(double amount) {
		balance += amount;
		System.out.println("deposited amount:" + amount + "new balance:" + balance);
	}

// static method
	public static void bankInfo() {
		System.out.println("Welcome to the bank:");
	}

// final method
	public final void showbalance() {
		System.out.println("available balance:" + balance);
	}
}

class SavingAcc extends RBI {

	public SavingAcc(String accountName, double balance) {
		super(accountName, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("withdrwal successfully:" + amount + ", remaining balance:" + balance);
		} else {
			System.out.println("insuffient balance");
		}

	}

}

public class AbstractionInJava {
	public static void main(String[] args) {
		RBI.bankInfo();
		RBI bank = new SavingAcc("Satya", 15000);
		bank.withdraw(2500);
		bank.showbalance();
		bank.deposit(4000);
		bank.showbalance();

	}

}
