package com.qa.Core_Java;

public class ControlStatementsInJava {
	public static void main(String[] args) {
		// 3 type of control statements
		// 1.Decision making statements--- if ,swicth
		// 2.loop statements----for loop ,for each, while, do while
		// 3.jump statements---- break, continue

		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.out.println("launch the chrome browser");
		} else {
			System.out.println("browser is not launched");
		}

		// if else if--- if statement followed by multiple else if statements, we can
		// also define else statement at the end of the chain
		String BROWSER = "firefox";
		if (BROWSER.equalsIgnoreCase("chrome")) {
			System.out.println("launch the chrome browser");
		} else if (BROWSER.equalsIgnoreCase("FIREFOX")) {
			System.out.println("launch firefox browser");
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			System.out.println("launch edge browser");
		}

		else {
			System.out.println("Browser is not valid");
		}

		// nested if statement---- check the eligibility for donate blood
		int age = 24;
		int weight = 50;
		if (age >= 18) {
			if (weight >= 45) {
				System.out.println("the person is eligible");

			}
		} else {
			System.out.println("The person is not eligible");
		}

		// switch statement

		int day = 1;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("WednesDay");
			break;
		case 4:
			System.out.println("WednesDay");
			break;

		default:
			System.out.println("The day is not valid");
		}

		// loops--- for loop for each while, do wile
//		print 1-100
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

		// i want to print 2-30--- even
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
		}

		System.out.println("odd numbers");
		// odd numbers
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < 5; i++) { // rows
			for (int j = i; j < 5; j++) {
				System.out.print("@"); // @@@@@@@@@@@@@@@@@
			}
			System.out.println();

		}

//	The Java for-each loop traverses the array or collection until the last element. For each element, 
//		it stores the element in the variable and executes the body of the for-each loop.
		int v[] = { 12, 23, 34, 56, 677 };

		String[] names = { "ravi", "Satya", "Sankar", "Suresh" };
		for (String name : names) {
			System.out.println(name);
		}
		for (int v1 : v) {
			System.out.println(v1);
		}

		// while: i is used to iterate a part of the program repeatedly until the
		// specified Boolean condition is true.

		int a = 10; // initialization
		while (a >= 0) { // condition
			System.out.print(a + " ");
			a--; // increment/decrement
		}
		System.out.println();
//		do while
		int i1 = 0;
		do {
			System.out.print(i1 + " ");
			i1++;
		} while (i1 <= 10);

		// break continue
		for (int p = 0; p <= 10; p++) {
			if (p == 5) {
//				break;
				continue;
			}
			System.out.println(p);

		}

		System.out.println("------------------");

		for (int i = 1; i < 5; i++) { // rows
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
//		syntax
		//Labeled for loop
				//labelname:    
//				for(initialization; condition; increment/decrement){    
					//code to be executed    
//					}  
		
		 aa:    
		        for(int i=1;i<=3;i++){    
		            bb:    
		                for(int j=1;j<=3;j++){    
		                    if(i==2&&j==2){    
		                        break aa;    
		                    }    
		                    System.out.println(i+" "+j);    
		                }
		
	}
	}}
