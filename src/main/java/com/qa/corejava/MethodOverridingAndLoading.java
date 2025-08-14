package com.qa.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodOverridingAndLoading {
	// method overloading ,method overriding, inheritance,encapsulation
	// Constructor,
//method overloading- we are creating the multiple methods having same name but different in parameters is known as methodoverloading
	public static void main(String[] args) {

		Bank b = new SBI(10000);  // child class object can be referred by parent class reference variable, it is called- dynamic polymorphisam/runtime polymorphisam,Topcasting
		b.checkBalance();
		b.moneytransfer(2000);
		b.checkBalance();
		// static polymorphisam/compile time polymorphisam
		SBI s=new SBI(20000);
		s.checkBalance();
		s.depositbalance(2000);
		s.checkBalance();
		s.moneytransfer(2000);
		s.checkBalance();
		
//		 downcasting--- parent class object can be referred by child class referrence variable---downcasting,we will get class cast exception
               SBI b1=(SBI) new Bank(1000);
               b1.moneytransfer(200);
               b1.checkBalance();
               b1.depositbalance(500);
               b1.checkBalance();
               
	}

	public static void click(WebElement element) {
		System.out.println("the element is clicked");
	}

	public static void click(WebDriver driver, WebElement element) {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void click(By locator) {
		System.out.println("by using locator we can do ");
	}

}

class Bank {
	private double balance;

	public Bank(double balance) { // constructor is special class, instance of a class,
		// The constructor name should be same as class name,values will be invoked at
		// the time of object creation
		this.balance = balance; // this is used to refer to the instance variables and compare the constructor
								// variables and instance
	}

	public void checkBalance() {
		System.out.println("balance is:" + balance);
	}

	public void moneytransfer(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
	}
}

// method overriding--- we can do method overrding by using extends keyword
//if child class is a the same method as present in the parent class is known is  methodoverriding, it is used to achieve runtime polymorphisam
//
class SBI extends Bank {

	double balance;

	public SBI(double balance) {
//		super(balance); // super keyword is used to call the parent class constructor,method,instance
		super(balance);			// variable
		this.balance=balance;
	}

	@Override
	public void checkBalance() {
		System.out.println("Check the sbi account balance:" + balance);
	}
	@Override
	public void moneytransfer(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		}
	}
	public void depositbalance(double amount) {
		if (amount > 0) {
			balance = +amount;
		}
		System.out.println("debitedamount is:" + amount);
	}

}
