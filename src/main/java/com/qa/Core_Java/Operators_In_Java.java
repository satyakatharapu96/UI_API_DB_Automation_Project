package com.qa.Core_Java;

public class Operators_In_Java {
	public static void main(String[] args) {
		
		System.out.println("arithmetic operators");
//		int a=203;
//		int b=20;
//		System.out.println(a+b);  //300
//		System.out.println(a-b);//100
//		System.out.println(a*b);//20000
//		System.out.println(a/b);//2
//		System.out.println(a%b);//0
		
		System.out.println("relational operators");
		//< ,> ,<= ,>= ,!= ,==
		int x=100;
		int y=200;
		 int z=300;
		 System.out.println(x<y);  //true
		 System.out.println(x>y);//false
		 System.out.println(x<=y);//t
		 System.out.println(x>=y);//f
		 System.out.println(x!=y);//t
		 System.out.println(x==y);//false
		 
		 //logical Operators
		 System.out.println(x>y&&x<z);  //Logical AND--- it will  does not check the second condition  if the first 
		 // condition is false, if the first condition is true then only it will check second condition
		 System.out.println(x>z||x<y);  // false||true---true
		 System.out.println(!(x>y));
		 
		 
		 //bitwise operators
		 int a=23;   //-----10111
		  int b=12;   //--- 01100
		  System.out.println(a&b);//00100-- 4 //all common  1 values getting---1 zeros---zero, different values getting zeros
		  System.out.println(a|b);//11111---31 // common zeros-- zero common 1 are-1, different--1
		 System.out.println(a^b); //11011--27   // XOR--- all common values zeros, different values-1
 		 
		
		
	}

}
