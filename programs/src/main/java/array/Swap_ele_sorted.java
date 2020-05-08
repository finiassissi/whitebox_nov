package array;
/*
 *  f. Write a program to locate and
 *   swap only 2 elements which are not sorted in a given sorted array. 
 *   For example given an array {1,2,5,6,4} 
 *  locate 5 and 4 and then swap them as they are not as per sorted order.
 */
public class Swap_ele_sorted {
	void swap_arrayelements(int[] arr) {
		//int[] arr = { 1, 2, 5, 6, 4 };
		int index = 0, result = 0;
		int temp = 0;

 		for (int i = 0; i < (arr.length)-1; i++) {
			if (arr[i] > arr[i + 1]) {
				index = i+1;
				//System.out.println(index);
			}
		}
		
		for (int i = index-1; i>0; i--) {
			if (arr[index] > arr[i - 1]) {
				temp = i;
				 //System.out.println(temp);
				 break;
			}
		}
		
		//System.out.println(temp);
		result = arr[index];
		arr[index] =arr[temp];
		arr[temp] = result;
			
		for (int j : arr) {
			System.out.print(j + " ");

		}
		System.out.println("\n");
	}
	
	 public static void main(String[] args) {
		Swap_ele_sorted so=new Swap_ele_sorted();
		int[] arr= { 1, 2, 5, 6, 4 };
		so.swap_arrayelements(arr);
		int[] arr1= { 1, 4, 5, 6, 2 };
		so.swap_arrayelements(arr1);
		int[] arr2= { 8, 4, 5, 6, 2 };
		so.swap_arrayelements(arr2);
		int[] arr3= { 1, 4, 5, 6, 2 };
		so.swap_arrayelements(arr3);


	}

}
