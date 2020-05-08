package Stringm;
/*
 *  Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.
 */
public class Reverse_String {
	void rev(String s) {
		char[] c=s.toCharArray();

		char[] p=new char[c.length];
		int j=0;
		for(int i=c.length-1;i>=0;i--) { 
			p[j++]=c[i];
			
		}
		 for(int i=0;i<p.length;i++) {
			System.out.print(p[i]);
		 }
	
		
	}
	public static void main(String[] args) {
		Reverse_String obj=new Reverse_String();
		obj.rev("finifrancis");
	}

}
