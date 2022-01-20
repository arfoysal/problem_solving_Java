package problem_solving;

public class GenerateFibonacciSeries {
	/*
	 * Write a function that takes a integer n and Generate Fibonacci Series of n-th
	 * numbers. A Fibonacci Series is a series of numbers in which each number
	 * (Fibonacci number) is the sum of the two preceding numbers
	 */
	public static void main(String[] args) {
		int n = 20;

		fibonacciSeries(n);
	}

	public static void fibonacciSeries(int n) {
		int a = 0, b = 1, number = 0;
		System.out.print(a + " " + b);

		while (n - 2 > 0) {
			number = a + b;
			System.out.print(" " + number);
			a = b;
			b = number;
			n--;

		}

	}
}