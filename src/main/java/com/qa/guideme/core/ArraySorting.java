package com.qa.guideme.core;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {

//		Method1
		int arr[] = { 33, 3, 4, 5 };
		Arrays.sort(arr);
		System.out.println("Array Accending order: " + Arrays.toString(arr));
//		Method2
		int nonSortedArray[] = { 23, 13, 43, 25 };
		int[] sortedArray = new int[nonSortedArray.length];
		int temp;
		for (int i = 0; i < nonSortedArray.length; i++) {
			for (int j = i + 1; j < nonSortedArray.length; j++) {
				if (nonSortedArray[i] > nonSortedArray[j]) {
					temp = nonSortedArray[i];
					nonSortedArray[i] = nonSortedArray[j];
					nonSortedArray[j] = temp;
					sortedArray = nonSortedArray;
				}
			}
		}
		System.out.println("Sorted Accending order: " + Arrays.toString(sortedArray));
	}
}
