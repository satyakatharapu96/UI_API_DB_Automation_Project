package com.qa.Core_Java;

public class Student_Data {
//  static and private variable we can access with in the class
	private static String name;
	// private instance variables
	private int age;
	private String Subject;
	private int rollnum;

//	creating constructor

	// 1. this keyword is used to differentiate between instance variables and local
	// variables
	public Student_Data(int age, String Subject, int rollnum) {
		this.age = age;
		this.Subject = Subject;
		this.rollnum = rollnum;

	}

	// 2️.Using this keyword to invoke constructor (constructor chaining)
	public Student_Data() {
		this(23, "English", 4);
		System.out.println("default constructor");

	}

	// 3.to invoke current class method
	public void showdetails() {
		this.display();
	}

	// 4.passing this as an argument
	public void process(Student_Data obj) {
		System.out.println("received object" + obj);
	}

	public void callProcess() {
		process(this);// to invoke current class method

	}

//	 Returning current instance using this
	public Student_Data getInstance() {
		return this;
	}

	public void display() {
		System.out.println("Age is:" + age);
		System.out.println("Subject:" + Subject);
		System.out.println("rollnum:" + rollnum);
//		System.out.println("age is-->" + age + "subject is:--->" + Subject + "rollnum--->" + rollnum);

	}

	public static void main(String[] args) {
//		name="Sankar darapureddi"; or
		System.out.println(name = "Sankar darapureddi");// print static variable
		// or
		System.out.println(Student_Data.name);
		Student_Data s1 = new Student_Data();// initialize zero params constructor
		s1.showdetails();
		s1.callProcess(); // received objectcom.qa.Core_Java.Student_Data@72ea2f77
		s1.getInstance();
		System.out.println("---------------------------");
		Student_Data s2 = new Student_Data(30, "Kesava Prakash", 35);
		s2.showdetails();
		s2.callProcess();
		// Getting current instance of s2 and assigning it to s3
		System.out.println("Accessed through getInstance():");//
		Student_Data s3 = s2.getInstance(); //// Now s3 and s2 refer to the same object
		s3.display();
		
		

	}

}
