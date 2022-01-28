package problem_solving;

public class StringCointins {

	/*
	 * Write a function that takes two string as input and return Boolean. if the
	 * 2nd string is a substring of the first string it returns true and if not it
	 * returns false. input: “Monograms” “gram” output: true
	 */	
	
	public static void main(String[] args) {
		String str1 = "Monograms";
		String str2 = "gram";
		subStringCheck(str1,str2);

	}
	
	private static void subStringCheck(String str1, String str2) {
		if(str1.contains(str2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
	}

}
