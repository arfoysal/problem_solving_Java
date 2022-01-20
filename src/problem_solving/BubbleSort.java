package problem_solving;

import java.util.Arrays;

public class BubbleSort {

	/*
	 * Write a function that Sort an Array -- Using Bubble sort. Bubble Sort is the
	 * simplest sorting algorithm that works by repeatedly swapping the adjacent
	 * elements if they are in wrong order.
	 */

	public static void main(String[] args) {

		int a[] = { 4, 2, 3, 1, 5, 6, 8, 7 };
		System.out.println("Array before sorting: " + Arrays.toString(a));

		sortUsingBubbleSort(a);

	}

	private static void sortUsingBubbleSort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) { // total iteration will be n*n 

				if (a[j] > a[j + 1]) {
					int k = a[j + 1];
					a[j + 1] = a[j];
					a[j] = k;
				}
			}
		}
		System.out.println("Array after sorting: " + Arrays.toString(a));

	}

}
