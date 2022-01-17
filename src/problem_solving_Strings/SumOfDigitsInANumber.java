package problem_solving_Strings;

public class SumOfDigitsInANumber {
	/*
	 * Write a function that takes a number as input and Count Sum of the digits in
	 * the given number. Input: 12321 Output: Sum of the Digits: 9
	 */
	public static void main(String[] args) {
		int number = 12321;

		// Using algorithm
		countSumOfDigits(number);
	}

	// Using algorithm
	public static void countSumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10; // remainder must be the last digit of the number
			number = number / 10; // 1232; 123; 12; 1; 0;
		}
		System.out.println("Sum of the Digits: " + sum);

	}
}
