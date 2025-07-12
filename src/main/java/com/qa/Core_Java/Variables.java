package com.qa.Core_Java;

public class Variables {
	// instance variable
	int age;

	static String clg = "Raja";// static variable

	public int add() {
		int a = 10; // local
		int b = 20;
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(Variables.clg);
		Variables v1 = new Variables();
		int value = v1.age = 23;
		System.out.println(value);
		int data = v1.add();
		System.out.println(data);
		int mob = 9876543; // local
		System.out.println(mob);
	}

}
