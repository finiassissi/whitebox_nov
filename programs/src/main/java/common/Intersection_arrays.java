package common;
/*
 * Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
 */
import java.util.HashSet;
import java.util.Set;

public class Intersection_arrays {
	public Set<Integer> fun(int[] arr1, int[] arr2) {

		if (arr1 == null || arr2 == null) {
			System.out.println("Null values are not accepted");
			return null;
		}
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i : arr1) {
			set1.add(i);

		}
		for (int i : arr2) {
			set2.add(i);
		}

		set1.retainAll(set2);

		//System.out.println(set1);
		return set1;

	}

}
