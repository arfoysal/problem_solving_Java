package problem_solving;

public class LinearSearch {
	/*
	 * Write a function that search an element in Array -- by linear Search
	 * Algorithm Linear search is a very simple search algorithm. In this type of
	 * search, a sequential search is made over all items one by one. Every item is
	 * checked and if a match is found then that particular item is returned,
	 * otherwise the search continues till the end of the data collection.
	 */

	public static void main(String[] args) {

		int a[] = { 10, 20, 300, 40, 502, 50, 20 };
		int search_element = 51;

		searchElementUsingLinearSearch(a, search_element);

	}

	private static void searchElementUsingLinearSearch(int[] a, int search_element) {
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (search_element == a[i]) {
				System.out.println("Element found at: " + (i + 1));
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Element not found");
		}

	}

}
