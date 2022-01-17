package problem_solving_Strings;

public class SumOfAllElementsOfArry {
	/*
	 * Write a function that takes a number Array as input and find the sum of all
	 * Elements of the given Array.
	 */

	public static void main(String[] args) {
		int a[] = { 5, 2, 8, 9, 5, 1 };

		sumOfAllElements(a);

		// Using Enhanced for loop
		sumOfArryElements(a);

	}

	public static void sumOfAllElements(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum of array elements: " + sum);

	}

	// Enhanced for loop
	public static void sumOfArryElements(int[] a) {
		int sum = 0;
		for (int element : a) {
			sum += element;
		}
		System.out.println("Sum of array elements: " + sum);

	}

}
