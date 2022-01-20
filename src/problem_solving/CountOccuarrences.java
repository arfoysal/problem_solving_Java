package problem_solving;

public class CountOccuarrences {

	public static void main(String[] args) {
		// count single character occurrences
		String str = "The purpose of our lives is to be happy";
		int intial_length = str.length();
		str = str.replace("p", "");
		int final_length = str.length();
		int count = intial_length - final_length;
		System.out.println("Number of occurrence of 'p' is: " + count);

		// count single word occurrences
		String str1 = "Not how long, but how well you have lived is the main thing";
		String strArray[] = str1.split(" ");
		int countA = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals("how")) {
				countA += 1;
			}
		}
		System.out.println("Number of occurrence of 'how' is: " + countA);

		// Count number of words in a string
		String str3 = "In order to write about life first you must live it";
		System.out.println("Number of words is: " + str3.split(" ").length); // problem is its just work with single
																				// space ....

		// Count number of words in a string Using condition and loop
		int countB = 1;
		for (int i = 0; i < str3.length(); i++) {
			if ((str3.charAt(i) == ' ') && (str3.charAt(i + 1) != ' ')) {
				countB++;
			}
		}
		System.out.println("Number of words is: " + countB);
	}

}
