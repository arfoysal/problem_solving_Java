package problem_solving;

import java.util.Arrays;
import java.util.Collections;

public class findNthHighestNumber {
	/*
	 * Write a function that takes two input, an array integer list with unique
	 * numbers and an integer(n) find the nth highest number from the list. 
	 * input =[50, 20, 30,10,40, 55]; n= 3 ; output = 40
	 */
	public static void main(String[] args) {
		Integer input[] = { 50, 20, 30, 10, 40, 55};
		int n = 3;

		// Reverse Descending order sort using Arrays.sort() method
		Arrays.sort(input, Collections.reverseOrder()); // collection doesn't support permeative data type
		System.out.println("the "+ n +"th highest number: " + input[n-1]);

	}

}
