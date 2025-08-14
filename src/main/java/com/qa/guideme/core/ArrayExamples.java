package com.qa.guideme.core;

import java.util.Arrays;

public class ArrayExamples {
	public static void main(String[] args) {
		twoDemArrayLiterals();
		twodemArray();
	}

	// two demensional array with String literals
	public static void twoDemArrayLiterals() {
		String names[][] = { { "john", "smith" }, { "Satya", "katarapu" }, { "Jamaes", "Gosling" } };
		for (String i[] : names) {
			for (String value : i) {
				System.out.print(value + "\t");
			}
			System.out.println("\n");
		}
	}

	public static void twodemArray() {
		int board[][] = new int[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = i + j;

			}
		}
		for (int a[] : board) {
			for (int i: a) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");

		}
		//another way to print two dem array:
		System.out.println(Arrays.deepToString(board));
	}
	
	
	
	public static void threeDemArray() {
		int[][][] myArray = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 1, 4, 9 }, { 16, 25, 36 } },
				{ { 1, 8, 27 }, { 64, 125, 216 } } };
		System.out.println("3x2x3 array is given below:");
	}
}
