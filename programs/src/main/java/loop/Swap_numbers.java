package loop;
/*
 * 
 * c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.
 */
public class Swap_numbers {

	public int[] swap_num_withtwo_variable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a+" "+b);
		return new int[] { a, b };

	}
	public int[] swap_num_withtwo_variable(int a, int b,int temp) {
		temp=a;
		a=b;
		b=temp;
		 System.out.println(a+" "+b);
		return new int[] {a,b}; 
		
	}

}
