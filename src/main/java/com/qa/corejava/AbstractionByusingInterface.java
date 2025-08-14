package com.qa.corejava;

interface Searchable {
	String platform = "e-commerce"; // constant values and static and final in nature
	// it can have abstract methods

	void searchProduct(String product);

	void filerResults(String criteria);

	// since java 8 we can have method body in interface but we need to make it
	// default.
	default void sortResults(String type) {
		System.out.println("sort results by type:" + type);
	}

	// we can have static method in interface since java8
	public static void printplatform() {
		System.out.println("platform:" + platform);
	}
}

class Amazon implements Searchable {
	public void searchProduct(String product) {
		System.out.println("searching on amazon for:" + product);
	}

	public void filerResults(String criteria) {
		System.out.println("filtering amazon results in  by:" + criteria);
	}

}

class Flipcart implements Searchable {
	public void searchProduct(String product) {
		System.out.println("searching on amazon for:" + product);
	}

	public void filerResults(String criteria) {
		System.out.println("filtering amazon results in  by:" + criteria);
	}

}

public class AbstractionByusingInterface {
	public static void main(String[] args) {
		// we cannot create the object of the interface
		Searchable s = new Amazon();
		s.searchProduct("loptops");
		s.filerResults("customer ratings");
		Searchable s1 = new Flipcart();
		s1.searchProduct("Jeans");
		s1.filerResults("customer reviews");
	}

}
