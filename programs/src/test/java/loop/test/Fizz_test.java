package loop.test;
/*
 * TESTCASES
 *  Write a program print "fizz" if a number is divisible by 3, 
 *  "buzz"if a number is divisible by 5,
 *   and "fizz buzz" if number is divisible by both, else print the number.
 */
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import loop.Fizz;

public class Fizz_test extends Fizz{
	Fizz_test obj;
	
	
	@BeforeTest
	void setup() {
		obj=new Fizz_test();
		
	}
	@Test
	void numberdiv3() {
	//number divide by 3
	  Assert.assertEquals( obj.fi(9), "fizz");
	}
	@Test(priority=2)
	void numberdiv5() {
	//number divide by 5
	  Assert.assertEquals( obj.fi(25),"buzz");
	}
	@Test(priority=3)
	void numberdiv3and5() {
	//number divide by 3 and 5
	  Assert.assertEquals( obj.fi(45),"fizzbuzz");
	  }
	@Test(priority=4)
	void numberdivnone() {
	//number divide by none of these
	  Assert.assertEquals( obj.fi(17),"num");
	}
	@Test(priority=5)
	void numberdivzero() {
	//number divide by none of these
	  Assert.assertEquals( obj.fi(0),"fizzbuzz");
	}
	@Test(priority=6)
	void numberdivneg() {
	//number divide by none of these
	  Assert.assertEquals( obj.fi(-18),"fizz");
	}
}
