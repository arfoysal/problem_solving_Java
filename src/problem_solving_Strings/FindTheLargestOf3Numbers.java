package problem_solving_Strings;

public class FindTheLargestOf3Numbers {
	/*
	 * Write a function that takes 3 number as input and find the largest one in the
	 * given numbers. Input: 70 10 55 Output: 70
	 */
	public static void main(String[] args) {
		int number1 = 70, number2 = 10, number3 = 55;

		// using if condition --logic
		findMaxUsingIf(number1, number2, number3);

		// using Ternary Operator
		findMaxUsingTernary(number1, number2, number3);

	}

	// using if condition --logic
	public static void findMaxUsingIf(int number1, int number2, int number3) {
		if (number1 > number2 && number1 > number3) {
			System.out.println(number1 + " is the leargest Number");

		} else if (number2 > number1 && number2 > number3) {
			System.out.println(number2 + " is the leargest Number");
		} else {
			System.out.println(number3 + " is the leargest Number");
		}

	}

	// using Ternary Operator
	public static void findMaxUsingTernary(int number1, int number2, int number3) {
		int temp = number1 > number2 ? number1 : number2;
		int lergestnumber = temp > number3 ? temp : number3;
		System.out.println(lergestnumber + " is the leargest Number");

	}

}
