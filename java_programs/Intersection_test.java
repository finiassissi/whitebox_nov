package common_test;
/*Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.*/


import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Intersection_arrays;

public class Intersection_test extends Intersection_arrays{
	Intersection_test obj;
	@BeforeTest
	void setup() {
		obj=new Intersection_test();
	}
	@Test
	 void valid_arrays() {
		 int[] arr1= {4,9,5};
			int[] arr2= {9,4,9,8,4};
			System.out.println(obj.fun(arr1, arr2));
			Set<Integer> set=new HashSet<Integer>();
			set.add(4);
			set.add(9);
			Assert.assertEquals((obj.fun(arr1, arr2)), set);
	}
	@Test
	void valid_duplicatenum_arrays() {
		int[] arr1= {1,2,2,1};
		int[] arr2= {2,2};
		Set<Integer> set=new HashSet<Integer>();
		set.add(2);
		System.out.println(set);
		Assert.assertEquals((obj.fun(arr1, arr2)), set);
	}
	
	 
	@Test
	 void valid_empty_arrays() {
		 int[] arr1= {4,9,5};
			int[] arr2= {};
			System.out.println(obj.fun(arr1, arr2));
			Set<Integer> set=new HashSet<Integer>();
		
			Assert.assertEquals((obj.fun(arr1, arr2)), set);
	 }
	@Test
	 void valid_negnumber_arrays() {
		 int[] arr1= {4,9,-5};
			int[] arr2= {-5,1,9};
			System.out.println(obj.fun(arr1, arr2));
			Set<Integer> set=new HashSet<Integer>();
			set.add(-5);
			set.add(9);
			Assert.assertEquals((obj.fun(arr1, arr2)), set);
	 }

}
