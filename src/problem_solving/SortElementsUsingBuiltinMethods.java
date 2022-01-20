package problem_solving;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsUsingBuiltinMethods {

	public static void main(String[] args) {
		int a[] = { 4, 2, 3, 1, 5, 6, 8, 7 };
		System.out.println("Array before sorting: " + Arrays.toString(a));

		// using Arrays.parallelSort() method
		Arrays.parallelSort(a);
		System.out.println("Array after sorting: " + Arrays.toString(a));

		// using Arrays.sort() method
		int b[] = { 40, 2, 3, 100, 50, 60, 88, 70 };
		System.out.println("Array before sorting: " + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Array after sorting: " + Arrays.toString(b));

		// Reverse Descending order sort using Arrays.sort() method
		Integer c[] = { 400, 200, 3, 100, 50, 60, 88, 70 };
		System.out.println("Array before sorting: " + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder()); // collection doesn't support permeative data type
		System.out.println("Array after Descending sorting: " + Arrays.toString(c));

	}

}
