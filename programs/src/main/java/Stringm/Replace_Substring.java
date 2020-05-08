package Stringm;
/*
 *  Write a program to find a substring in a given string and then replace it with another string.
 */
public class Replace_Substring {
void substring(String s,String search) {
	String temp=s.replaceAll("good", "bad");
	System.out.println(temp);
	
}
public static void main(String[] args) {
	Replace_Substring obj=new Replace_Substring();
	obj.substring("this is a good day", "good");
}

}
