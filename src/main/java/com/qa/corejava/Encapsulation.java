package com.qa.corejava;

public class Encapsulation {
	// binding code and data into a single unit is called encapsulation
	// if a class is fully encapsulated then we use private access modifier
	// if we want to get values set the values we can use either getters/setters
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setFirst_Name("satyannarayana");
		e.setLast_Name("katarapu");
		e.setMobile_Number(987654321);
		e.setEmail("satya12@gmail.com");
		e.setCompanyName("ICICI");
		e.setAddress("HYD");
		System.out.println(e.getFirst_name());
		System.out.println(e.getLast_name());
		System.out.println(e.getmobilenum());
		System.out.println(e.getMail());
		System.out.println(e.address());
		System.out.println(e.companyName());

	}

	String first_name;
	String last_name;
	int mobilenum;
	String mail;
	String companyname;
	String address;

	public String getFirst_name() {
		return first_name;

	}

	public void setFirst_Name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;

	}

	public void setLast_Name(String last_name) {
		this.last_name = last_name;
	}

	public int getmobilenum() {
		return mobilenum;
	}

	public void setMobile_Number(int mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getMail() {
		return mail;

	}

	public void setEmail(String mail) {
		this.mail = mail;
	}

	public String companyName() {
		return companyname;
	}

	public void setCompanyName(String companyname) {
		this.companyname = companyname;
	}

	public String address() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
