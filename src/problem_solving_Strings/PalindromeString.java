package problem_solving_Strings;

public class PalindromeString {
	/*
	 * Write a function to check given string is a Palindrome string or not? A
	 * palindrome string is a string that remains the same when its characters are
	 * reversed. like MADAM Input: MADAM Output: true input: TEACHER Output: false
	 * Hints: if a tring is equals of its reverse string then its must be a
	 * palindrome string
	 */
	public static void main(String[] args) {
		String textString = "MADADADAM";
		// there are four different way to solve this problem

		// Using charAt() and + (string concatenation) operator
		reverseStr(textString);
		

		// Using toCharArray() and + (string concatenation) operator
		usingToCharArrayReverseStr(textString);
		

		// Using StringBuffer class
		usingStringBufferClass(textString);

		// Using StringBuilder class
		usingStringBuilderClass(textString);

	}

	// Using charAt() and + (string concatenation) operator
	public static void reverseStr(String textString) {
		String rev = "";
		for (int i = textString.length() - 1; i >= 0; i--) { //
			rev = rev + textString.charAt(i);
		}
		if (rev.equals(textString)) {
			System.out.println("this string [ " + textString + " ] is a Palindrome String");
		}else {
			System.out.println("this string [ " + textString + " ] is not a Palindrome String");
		}
	}

	// Using toCharArray() and + (string concatenation) operator
	public static void usingToCharArrayReverseStr(String textString) {
		String rev = "";
		char ch[] = textString.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) { //
			rev = rev + ch[i];
		}
		if (rev.equals(textString)) {
			System.out.println("this string [ " + textString + " ] is a Palindrome String");
		}else {
			System.out.println("this string [ " + textString + " ] is not a Palindrome String");
		}
		
	}

	// Using StringBuffer class
	public static void usingStringBufferClass(String textString) {
		StringBuffer sBuffer = new StringBuffer(textString);
		StringBuffer revBuffer = sBuffer.reverse();
		if (revBuffer.toString().equals(textString)) {
			System.out.println("this string [ " + textString + " ] is a Palindrome String");
		}else {
			System.out.println("this string [ " + textString + " ] is not a Palindrome String");
		}
	}

	// Using StringBuilder class
	public static void usingStringBuilderClass(String textString) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(textString);
		StringBuilder revBuilder = sBuilder.reverse();
		if (revBuilder.toString().equals(textString)) {
			System.out.println("this string [ " + textString + " ] is a Palindrome String");
		}else {
			System.out.println("this string [ " + textString + " ] is not a Palindrome String");
		}
	}

}
