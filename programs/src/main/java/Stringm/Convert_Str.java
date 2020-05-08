package Stringm;
/*
 * Write a program which accepts a string like "This is nice" and 
 * converts it to a string like "This1 is2 nice3".
 */
public class Convert_Str {
	void str_convert(String s) {
		int count=1;
		String[] str=s.split(" ");
		for(String m:str)
		  System.out.print(m + count ++ +" ");
		
}
	 public static void main(String[] args) {
		 Convert_Str obj=new Convert_Str();
		  obj.str_convert("This is nice");
	}
}
