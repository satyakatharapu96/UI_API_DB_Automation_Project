package com.qa.Core_Java;

public class ThisKeywordInJava {

	String firstname;
	String lastname;
	String mailid;

	public ThisKeywordInJava(String firstname, String lastname, String mailid) {
		this.firstname = firstname;
		this.lastname = lastname;

	}

	public void displayData() {
		System.out.println("f_name :" + firstname + " lastname: " + lastname + " mail :" + mailid);
	}

	public static void main(String[] args) {
		ThisKeywordInJava th = new ThisKeywordInJava("Ravi", "Boddana", "raviboddana44@gmail.com");
		th.displayData();
	}
}