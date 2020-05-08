package loop;
/*
 *  Write a program print "fizz" if a number is divisible by 3, 
 *  "buzz"if a number is divisible by 5,
 *   and "fizz buzz" if number is divisible by both, else print the number.
 */
public class Fizz {
	public String fi(int num) {
		
		 if(num%3==0 && num%5==0) {
			 System.out.println("fizzbuzz");
			 return "fizzbuzz";
		 } 
		 if (num%3==0) {
			 System.out.println("fizz");
			 return "fizz";
			 
		 }
		 if(num%5==0) {
			 System.out.println("buzz");
			 return "buzz";
		 }
	
		
			 System.out.println(num);
		     return "num";	
	}
	
	
}
