package loop;
/*
 * f. Write a program  to check an armstrong number
 *  i.e. whether the if we power up the each individual number to the total number of digits in the number 
 *  and add them it should be equal to the number itself. 
 *  For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
    		FYI: ^ means is to the power.
 */
public class Armstrong {
	boolean armstrong(int num) {
		int number=num,result=0,temp=0;
		while(number!=0) {
			temp=number%10;
			result=result+temp*temp*temp;
			 System.out.println(result);
			number=number/10;
		}
	if(result==num)
		return true;
	else
		return false;
	
	}
	 public static void main(String[] args) {
		Armstrong obj=new Armstrong();
	System.out.println(obj.armstrong(371));
	System.out.println(obj.armstrong(150));
		
	}
}
