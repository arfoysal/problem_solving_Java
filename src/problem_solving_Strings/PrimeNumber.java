package problem_solving_Strings;

public class PrimeNumber {
	/*
	 * Write a function to check the given number is a Prime Number or not? A prime
	 * number is a natural number and greater than 1 which has only two factors 1,
	 * and itself.. Example::: 
	 * 19::: 1 and 19 Prime Number 
	 * 28::: 1,2,4,7,14,28 Not a Prime 
	 * Prime Number Examples: 2, 3, 5, 7, 11, 13, 17..
	 */

	public static void main(String[] args) {
		int number = 17;
		primeNumberCheck(number);
	}

	public static void primeNumberCheck(int number) {
		boolean flag = false;
		if (number > 1) {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("this number is not a prime number");
		} else {
			System.out.println("This number is a prime number");
		}

	}

}
