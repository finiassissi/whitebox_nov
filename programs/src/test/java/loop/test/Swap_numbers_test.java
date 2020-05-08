package loop.test;
/*
 * c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.
 */
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import loop.Swap_numbers;

public class Swap_numbers_test extends Swap_numbers {
	Swap_numbers_test obj;
	@BeforeTest
	void setup() {
		obj=new Swap_numbers_test();
	}
	@Test
		void swap_with_postivenumbers() {
		int[] b= {5,4};
		int[] c= {8,10};
		Assert.assertEquals(obj.swap_num_withtwo_variable(4, 5), b);
		Assert.assertEquals(obj.swap_num_withtwo_variable(10,8,0), c);
	
}
}
