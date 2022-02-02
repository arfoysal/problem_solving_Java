package problem_solving;

import java.util.HashSet;

public class FindIntersectOfTwoArrays {
	// write a java program to find intersection of 2 arrays in java?
	// input: {1,2,3,4} and {5,4,7,8}. Output: 4
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[] = {5,4,7,8};
		
		findintersect(a,b);
	}
	private static void findintersect(int[] a, int[] b) {
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i = 0; i<a.length;i++) {
			hashSet.add(a[i]);
		}
		for(int i = 0; i<b.length;i++) {
			if (!hashSet.add(b[i])) {
				System.out.println(b[i]);
			}
		}
		
	}

}
