package problem_solving_Strings;

public class Pangram {
	/*
	 * Write a function to check given String is pangram or not? A pangram or
	 * holoalphabetic sentence is a sentence using every letter of a given alphabet
	 * at least once. For example: "The quick brown fox jumps over the lazy dog" -
	 * is a pangram "hello world" = is not a pangram
	 */
	public static void main(String[] args) {

		String textString = "The quick brown fox jumps over the lazy dog";
		boolean ispangram = pangramtest(textString);
		System.out.println("is the given text a pangram? " + ispangram);

	}

	public static boolean pangramtest(String textString) {
		textString = textString.toUpperCase();
		if (textString.length() < 26) {
			return false;
		} else {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				if (textString.indexOf(ch) < 0) {
					return false;
				}
			}
		}
		return true;
	}

}
