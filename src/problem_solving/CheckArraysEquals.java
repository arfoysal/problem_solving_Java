package problem_solving;

import java.util.Arrays;

public class CheckArraysEquals {
	/*
	 * Write a function that takes two Arrays and check the Equality of two Arrays
	 */

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 4, 5, 6 };

		// Using Arrays class
		arrysEqualsCheck(a, b);

		// Using condition and loop
		arrysEqualsCheckUsingLoop(a, b);

	}

	// Using Arrays class
	public static void arrysEqualsCheck(int[] a, int[] b) {
		if (Arrays.equals(a, b)) {
			System.out.println("Arrays are Equals");

		} else {
			System.out.println("Arrays are not Equals");

		}

	}

	// Using condition and loop
	public static void arrysEqualsCheckUsingLoop(int[] a, int[] b) {
		boolean status = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					status = false;
					break;
				}
			}
		} else {
			status = false;
		}
		if (status) {
			System.out.println("Arrays are Equals");

		} else {
			System.out.println("Arrays are not Equals");

		}
	}

}
