package com.qa.guideme.core;

public class fabinocciSeries {
	public static void main(String[] args) {
		//Output: 0 1 1 2 3 5 8 13 21 34
		//Time Complexity: O(N) 
		//Auxiliary Space: O(N)
		// number is
		int N = 10;
		for (int i = 0; i < N; i++) {
			System.out.print(fab(i) + " ");
		}
		System.out.println();
		int n=20;
		 for(int i=0;i<n;i++) {
			 System.out.print(fab(i)+" ");
			 
		 }
		System.out.println();
		fabinocci(15);
	}

	// dynamic programming approach
	// fabinocci series
	// function
	static int fab(int n) {

		// avoiding ArrayIndexOutOfBoundsException.
		// 1 extra to handle case
		int f[] = new int[n+2];// n+2 ensures there’s enough space even for small n (like n=0 or n=1),
		int i;
		f[0] = 0;
		f[1] = 1;
		for (i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];

		}
		// nth fabinocci series
		return f[n];
	}

	public static void fabinocci(int num) {
		int first = 0;
		int second = 1;
		System.out.print("fabinacci series:" + first + " " + second);
		for (int i = 2; i <= num; i++) {
			int next = first + second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}
	}

}
