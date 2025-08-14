package com.qa.guideme.core;

public class ArmStrongNumber {
	public static void main(String[] args) {
		// 153--->1*1*1+5*5*5+3*3*3=153
		isarmstrongnumber(153);
		isarmstrongnumber(407);
		isarmstrongnumber(1);
		isarmstrongnumber(373);
	}

	public static void isarmstrongnumber(int num) {
		int cube = 0;
		int t;
		int r;
		t=num;
		while (num > 0) {
			r = num % 10; // r
			cube = cube + (r * r * r);
			num = num / 10;
		}
		if (t == cube) {
			System.out.println("that is armstrong number");
		} else {
			System.out.println("that is not armstrng number");
		}
	}

}
