package problem_solving;

public class ReverseNumber {
	/*
	 * Write a function that takes input as an integer number and returns the
	 * reverse of the integer. Input = 12547 Output = 74521
	 */
	public static void main(String[] args) {
		int number = 12547;
		//there are three different way to solve this problem
		
		// Using algorithm
		int rev_number = reverse(number);
		System.out.println("The reverse number is " + rev_number);

		// Using StringBuffer class
		usingStringBufferClass(number);

		// Using StringBuilder class
		usingStringBuilderClass(number);

	}

	// Using algorithm
	public static int reverse(int number) {
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10; // 0 + 7; 70+4; 740+5; 7450+2; 74520 +1;
			number = number / 10; // 1254; 125; 12; 1; 0;
		}
		return rev;
	}

	// Using StringBuffer class
	public static void usingStringBufferClass(int number) {
		StringBuffer sBuffer = new StringBuffer(String.valueOf(number)); // String.valueOf(number) convert a number to a
																			// string
		StringBuffer revBuffer = sBuffer.reverse();
		System.out.println("The reverse number is " + revBuffer);
	}

	// Using StringBuilder class
	public static void usingStringBuilderClass(int number) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(number);
		StringBuilder revBuilder = sBuilder.reverse();
		System.out.println("The reverse number is " + revBuilder);
	}

}
