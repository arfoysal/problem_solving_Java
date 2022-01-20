package problem_solving;

public class CountNumberOfEvenAndOddDigit {
	/*
	 * Write a function that takes a number as input and count number of even and
	 * odd digits in the given number Input: 12321 Output: Even Digits:2, Odd
	 * Digits: 3
	 */
	public static void main(String[] args) {
		int number = 12321;

		// Using algorithm
		countEvenandOdd(number);
	}

	// Using algorithm
	public static void countEvenandOdd(int number) {
		int countOdd = 0;
		int countEven = 0;
		while (number != 0) {
			if (number % 2 == 0) {
				countEven += 1;
			} else {
				countOdd += 1;
			}
			number = number / 10; // 1232; 123; 12; 1; 0;
		}
		System.out.println("Even digits: [ " + countEven + " ] Odd digits: " + "[ " + countOdd + " ]");

	}
}
