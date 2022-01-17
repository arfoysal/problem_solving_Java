package problem_solving_Strings;

public class CountNumberOfDigit {
	/*
	 * Write a function that takes a number as input and count number of digit in
	 * the given number Input: 12321 Output: 5
	 */
	public static void main(String[] args) {
		int number = 12321;
		// there are three different way to solve this problem

		// Using algorithm
		countDigit(number);

		// Using StringBuffer class and length()
		usingStringBufferClass(number);

		// Using StringBuilder class and length()
		usingStringBuilderClass(number);

	}

	// Using algorithm
	public static void countDigit(int number) {
		int count = 0;
		int tempNumber = number;
		while (tempNumber != 0) {
			tempNumber = tempNumber / 10; // 1232; 123; 12; 1; 0;
			count += 1;
		}
		System.out.println("Number of digit in  [ " + number + " ] is " + "[ " + count + " ]");

	}

	// Using StringBuffer class
	public static void usingStringBufferClass(int number) {
		StringBuffer sBuffer = new StringBuffer(String.valueOf(number)); // String.valueOf(number) convert a number to a
																			// string
		System.out.println("Number of digit in  [ " + number + " ] is " + "[ " + sBuffer.length() + " ]");
	}

	// Using StringBuilder class
	public static void usingStringBuilderClass(int number) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(number);
		System.out.println("Number of digit in  [ " + number + " ] is " + "[ " + sBuilder.length() + " ]");
	}

}
