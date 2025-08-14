package com.qa.corejava;

//for more understanding 
class BankAccount {
	protected String accountNumber;
	protected String accountHolder;
	protected double balance;

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + "amount deposited:" + "new balance" + balance);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(amount + "with drawal. remaining balance:" + balance);
		} else {
			System.out.println("insuffient balance");
		}
	}

	public void displayInfo() {
		System.out.println("account number:" + accountNumber);
		System.out.println("account Holder:" + accountHolder);
		System.out.println("account balance:" + balance);
	}

}

class SavingAccount extends BankAccount {

	private double interestrate;

	public SavingAccount(String accountNumber, String accountHolder, double balance, double interestrate) {
		super(accountNumber, accountHolder, balance);
		this.interestrate = interestrate;
	}

	public void addinterestrate() {
		double interest = balance * interestrate / 100;
		balance = balance + interest;
		System.out.println("interest added:" + interest + "new balance:" + balance);
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("interest rate is:" + interestrate + "%");
	}

}

public class InheritanceInJava {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount("111234567890980989", "Suryavardhan", 50000, 1);
		s.addinterestrate();
		s.displayInfo();
		s.deposit(5000);
		s.withdraw(4000);
		s.displayInfo();
	}

	// child class can inherits the properties and behaviors of a parent class is
	// known as a inheritance
	// we can do by using extends, multiple inheritance is not supported through
	// class it can be achieved by using interface
	// it is used for reusability,can be achieved runtime polymorhisam

	class Animal {
		String color;

		void eat() {
			System.out.println("eating the animals");
		}
	}

	class Dog extends Animal { // single inheritance-- one child class object inherits the parent class
		void bark() {
			System.out.println("dog is barking");
		}

	}

	class BabyDog extends Dog { // multi-level--- child class inherits the parent class, that child is the
								// parent of another child class
		void weep() {
			System.out.println("baby dog weeping");
		}
	}

	class Cat extends Animal { // Hierarchical--- one or more child classes extends the parent class
		void meow() {
			System.out.println("cat----meow");
		}

	}

}
