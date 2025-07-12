package com.qa.Core_Java;


// i covered variables, this, constructor,
public class Person {
	String name; // instance variable
	int age;
	int empid;
	static String companyname = "Hetero"; // static variable

	// constructor
	public Person(String name, int age, int empid) {
		this.name = name;
		this.age = age;
		this.empid = empid;

	}

	public void showdetails() {
		System.out.println("name:" + name + " age:" + age + " empid:" + empid);
	}

	public void getData(Person v) {
		this.showdetails();

	}

	public void userDetails() {
		int a = 28; // local variables
		System.out.println(a);
	}

	public static void main(String[] args){
//		1.local,2. instance,3.static variable
		// calling static variable
		System.out.println(Person.companyname);
		String village = "kotturu"; // local
//		 calling the constructor
		Person v = new Person("Ravi", 29, 876543);
		v.getData(v);
		v.userDetails();
		// Creating the object of the class
//		VariablesInJava v1 = new VariablesInJava();
//		v1.name = "ravi";
//		v1.age = 28;
//		v1.empid = 98765432;

		
		
		

	}

}
