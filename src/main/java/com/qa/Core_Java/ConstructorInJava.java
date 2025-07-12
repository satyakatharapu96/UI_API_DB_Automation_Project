package com.qa.Core_Java;

public class ConstructorInJava {
	String name;
	int age;;

	// can we do the construtor overloading-- yes we can - by changing different
	// parameters
	public ConstructorInJava() { // no arg constructor
		System.out.println("zero parameters constructor" + name + "age is-->" + age);
	}

	// aru-constructor
	public ConstructorInJava(String name, int age) {
		System.out.println("two parameters constructor Name--->" + name + "age--->" + age);

	}

	public static void main(String[] args) {
		ConstructorInJava c1 = new ConstructorInJava();
		ConstructorInJava c2 = new ConstructorInJava("Satyannarayana", 28);

	}

	// main method overloading--- yes we can by changing the different parameters
	public static void main(int args) {
		System.out.println("main method");
	}

	public static void main(String args) {
		System.out.println("main method");
	}

	public static void main(double args) {
		System.out.println("main method");
	}

}
