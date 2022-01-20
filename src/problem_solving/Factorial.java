package problem_solving;

import java.util.Random;

public class Factorial {
	/*
	 * Write a function that takes a number as input and find the factorial value of
	 * the given number. A factorial is a function that multiplies a number by every
	 * number below it. For example 5! = 5*4*3-2-1 = 120
	 */

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(20); // Random class object will give us a random number between 0 to 19

		findFactorialvalue(number);

	}

	public static void findFactorialvalue(int number) {
		int tempNumber = number;
		long value = 1;
		while (tempNumber > 0) {
			value *= tempNumber;
			tempNumber--;
		}
		System.out.println("The Factorial of " + number + "! is : " + value);

	}

}
