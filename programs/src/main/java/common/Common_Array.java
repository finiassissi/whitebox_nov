package common;

/*
 *  c. Write a program to find the common number in any given two arrays.
 */
public class Common_Array {

	boolean search(int a[], int val) {
		for (int i = 0; i < a.length; i++) {
			if (val == a[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	void funct(int[] arr1, int[] arr2) {
		
		int []result = new int[arr1.length > arr2.length ? arr1.length : arr2.length ];
		
		
		//c ? y : n
				
		int k = 0;
		boolean flag = false;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					if (!search(result, arr1[i])) {
						result[k++] = arr1[i];
					}
				}
			}
		}
		
		for (int i = 0; i < k; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		Common_Array obj = new Common_Array();

		int[] arr1 = { 9, 2, 4, 4, 4, 4, 4, 6 ,3};
		int[] arr2 = { 9, 2, 4, 4, 5, 6 };
		obj.funct(arr1, arr2);
	}
}
