package problem_solving;

public class ReverseString {
	/*
	 * Write a function that takes a string input and returns the reverse of the
	 * string. Input = "abcdeaf" Output = "faedcba"
	 */
	public static void main(String[] args) {
		String textString = "abcdeaf";
		// there are four different way to solve this problem

		// Using charAt() and + (string concatenation) operator
		String rev_String = reverseStr(textString);
		System.out.println("The reverse number is " + rev_String);

		// Using toCharArray() and + (string concatenation) operator
		String rev_StringToCharArry = usingToCharArrayReverseStr(textString);
		System.out.println("The reverse number is " + rev_StringToCharArry);

		// Using StringBuffer class
		usingStringBufferClass(textString);

		// Using StringBuilder class
		usingStringBuilderClass(textString);

	}

	// Using charAt() and + (string concatenation) operator
	public static String reverseStr(String textString) {
		String rev = "";
		for (int i = textString.length() - 1; i >= 0; i--) { //
			rev = rev + textString.charAt(i);
		}
		return rev;
	}

	// Using toCharArray() and + (string concatenation) operator
	public static String usingToCharArrayReverseStr(String textString) {
		String rev = "";
		char ch[] = textString.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) { //
			rev = rev + ch[i];
		}
		return rev;
	}

	// Using StringBuffer class
	public static void usingStringBufferClass(String textString) {
		StringBuffer sBuffer = new StringBuffer(textString);
		StringBuffer revBuffer = sBuffer.reverse();
		System.out.println("The reverse String is " + revBuffer);
	}

	// Using StringBuilder class
	public static void usingStringBuilderClass(String textString) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(textString);
		StringBuilder revBuilder = sBuilder.reverse();
		System.out.println("The reverse String is " + revBuilder);
	}

}
