package problem_solving;

import java.util.Arrays;

public class BinarySearch {

	/*
	 * Write a function that search an element in Array -- Using Binary Search
	 * Binary search, also known as half-interval search, logarithmic search, or
	 * binary chop, is a search algorithm that finds the position of a target value
	 * within a sorted array. Binary search compares the target value to the middle
	 * element of the array.
	 * Binary search is implemented using following steps...
		Step 1 - Read the search element from the user.
		Step 2 - Find the middle element in the sorted list.
		Step 3 - Compare the search element with the middle element in the sorted list.
		Step 4 - If both are matched, then display "Given element is found!!!" and terminate the function.
		Step 5 - If both are not matched, then check whether the search element is smaller or larger than the middle element.
		Step 6 - If the search element is smaller than middle element, repeat steps 2, 3, 4 and 5 for the left sublist of the middle element.
		Step 7 - If the search element is larger than middle element, repeat steps 2, 3, 4 and 5 for the right sublist of the middle element.
		Step 8 - Repeat the same process until we find the search element in the list or until sublist contains only one element.
		Step 9 - If that element also doesn't match with the search element, then display "Element is not found in the list!!!" and terminate the function.
	 */
	public static void main(String[] args) {
		int a []= {10, 20, 25, 30, 35, 40, 50, 60, 100}; // the array must be sorted to apply binary search
		int search_element = 50;
		
		searchElementsInArrayByBinarySearch(a, search_element); 
		
		// Using Built-in methods Arrays.binarySrarch()
		int position = Arrays.binarySearch(a, search_element);
		if (position<0) {
			System.out.println("Element is not found");
		}else {
			System.out.println("Element is found at position: " + position);
		}

	}

	private static void searchElementsInArrayByBinarySearch(int[] a, int search_element) {
		int lowerIndex = 0;
		int higherIndex = a.length-1;
		boolean flag = false;
		
		while (lowerIndex <= higherIndex) {
			int midIndex = (lowerIndex + higherIndex) / 2;
			
			if (a[midIndex] == search_element) {
				flag = true;
				System.out.println("Element is found at position: " + midIndex);
				break;
			}else if (a[midIndex] < search_element) {
				lowerIndex = midIndex + 1;
			}else {
				higherIndex = midIndex - 1;
			}
		}
		if (!flag) {
			System.out.println("Element is not found");
		}
		
	}

}
