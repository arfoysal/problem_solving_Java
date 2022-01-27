package problem_solving;

import java.util.HashSet;

public class FindDuplicateIElementsInArray {
	/*
	 * Write a function that takes a Array as input and Find is there a duplicate
	 * elements in Array or not?
	 */

	public static void main(String[] args) {
		String langs[] = { "java", "python", "c", "C++", "java" };

		// Using loop and Condition
		checkDuplicatByLoop(langs);

		// Using HashSet -- a set can't store duplicate value
		checkDuplicatByHashSet(langs);
	}

	// Using HashSet -- a set can't store duplicate value
	private static void checkDuplicatByHashSet(String[] langs) {
		boolean flag = true;
		HashSet<String> hashSet = new HashSet<String>();
		for (String item : langs) {
			System.out.println(hashSet);
			System.out.println(item);
			if (!hashSet.add(item)) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Duplicate Element not Found");
		} else {
			System.out.println("Duplicate Element Found");
		}
		System.out.println(hashSet);
		System.out.println();

	}

	// Using loop and Condition
	private static void checkDuplicatByLoop(String[] langs) {
		boolean flag = true;

		for (int i = 0; i < langs.length; i++) {
			for (int j = i + 1; j < langs.length; j++) {
				if (langs[i] == langs[j]) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("Duplicate Element not Found");
		} else {
			System.out.println("Duplicate Element Found");
		}

	}
}
