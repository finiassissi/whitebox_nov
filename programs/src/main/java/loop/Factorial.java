package loop;
/*
 *  Write a program  to calculate factorial of a given number. 
 *  You need to compute the factorial with one logic that uses recursion and
 *   another logic without recursion.
 */
public class Factorial {

	int fact_with_recursion(int n) {

		if(n<=1) 
			return 1;
		else
		return n*fact_with_recursion(n-1);
		
	}
	int fact(int num) {
		int result=1;
		if(num<=1) {
			return 1;
		}
		else {
			
		for(int i=1;i<=num;i++)
			result=num*(num-1);
		}
		return result;
		
		
		
	}
	 public static void main(String[] args) {
		Factorial obj=new Factorial();
		System.out.println(obj.fact_with_recursion(4));
		System.out.println(obj.fact(3));
	}
	
}
