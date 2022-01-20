package problem_solving;

public class PalindromeNumber {
	/*
	 * Write a function to check given number is Palindrome Number or not? A
	 * palindrome number is a number that remains the same when its digits are
	 * reversed. like 12321 Input: 12321 Output: true input: 12345 Output: false
	 * Hints: if a number is equals of its reverse number then its must be a
	 * palindrome number
	 */
	public static void main(String[] args) {
		int number = 12321;
		// there are three different way to solve this problem

		// Using algorithm
		reverse(number);

		// Using StringBuffer class
		usingStringBufferClass(number);

		// Using StringBuilder class
		usingStringBuilderClass(number);

	}

	// Using algorithm
	public static void reverse(int number) {
		int rev = 0;
		int tempNumber = number;
		while (tempNumber != 0) {
			rev = rev * 10 + tempNumber % 10; // 0 + 7; 70+4; 740+5; 7450+2; 74520 +1;
			tempNumber = tempNumber / 10; // 1254; 125; 12; 1; 0;
		}
		if (number == rev) {
			System.out.println("This number [ " + number + " ] is a Palindrome Number");
		} else {
			System.out.println("This number [ " + number + " ] is not a Palindrome Number");
		}

	}

	// Using StringBuffer class
	public static void usingStringBufferClass(int number) {
		StringBuffer sBuffer = new StringBuffer(String.valueOf(number)); // String.valueOf(number) convert a number to a
																			// string
		StringBuffer revBuffer = sBuffer.reverse();
		int revNumber = Integer.parseInt(revBuffer.toString());
		if (revNumber == number) {
			System.out.println("This number [ " + number + " ] is a Palindrome Number");
		} else {
			System.out.println("This number [ " + number + " ] is not a Palindrome Number");
		}

	}

	// Using StringBuilder class
	public static void usingStringBuilderClass(int number) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(number);
		StringBuilder revBuilder = sBuilder.reverse();
		int revNumber = Integer.parseInt(revBuilder.toString());
		if (revNumber == number) {
			System.out.println("This number [ " + number + " ] is a Palindrome Number");
		} else {
			System.out.println("This number [ " + number + " ] is not a Palindrome Number");
		}
	}

}
