package problem_solving;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		String str = "Welcome To Java";
		String rev_str = "";
		String words[] = str.split(" ");

		for (String word : words) {
			String rev_word = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev_word += word.charAt(i);
			}
			rev_str = rev_str + rev_word + " ";
		}
		System.out.println(rev_str);

		// using built- StringBuffer class object
		String str1 = "Welcome To Dhaka";
		String rev_str1 = "";
		String words1[] = str1.split(" ");

		for (String word1 : words1) {
			StringBuffer sBuffer = new StringBuffer(word1);
			rev_str1 = rev_str1 + sBuffer.reverse().toString() + " ";
		}
		System.out.println(rev_str1);

		// using built- StringBuilder class object
		String str2 = "Welcome To World";
		String rev_str2 = "";
		String words2[] = str2.split(" ");

		for (String word2 : words2) {
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(word2);
			rev_str2 = rev_str2 + sBuilder.reverse().toString() + " ";
		}
		System.out.println(rev_str2);
	}

}
