package problem_solving;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String str = "~!@(*^&$fish// cat**&&  & dog%% ";
		str = str.replaceAll("[^a-zA-Z0-9]", ""); // Replaces each substring of this string that matches the given regular
												// expression with the given replacement.
		System.out.println(str);
		
		// Removing white spaces
		String str1 = "Java     selenium";
		str1 = str1.replaceAll("\\s", ""); // regular expression for white space is \\s
		System.out.println(str1);

	}

}
