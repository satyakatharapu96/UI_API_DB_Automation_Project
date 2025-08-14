package com.qa.guideme.core;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int actualsum=0;
		for(int i=0;i<arr.length;i++) {
			actualsum+=arr[i];
		}
		System.out.println(actualsum);
		
		int expectedsum=0;
		for(int i=1;i<7;i++) {
			expectedsum=expectedsum+i;
		}
		System.out.println(expectedsum);
		System.out.println("missing number is:"+(expectedsum-actualsum));
	}

}
