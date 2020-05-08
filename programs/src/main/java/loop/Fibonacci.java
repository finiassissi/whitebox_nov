package loop;


/* Write a program that prints
 *  a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.
 *  You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or
 *   any desired number.
 */
import java.util.Scanner;

public class Fibonacci {
	@SuppressWarnings("resource")
	void fib() {
		System.out.println("enter the number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int temp;
		int i = 0;
		int j=1;
		System.out.println(i);
		 System.out.println(j);
		for (int k = 2; k <num; k++) {
			 
			  temp=i+j;
			  System.out.println(temp);
			  i=j;
			  j=temp;
			 

		}

	}
	public static void main(String[] args) {
		
			Fibonacci obj=new Fibonacci();
					obj.fib();
		
		
	}
}
