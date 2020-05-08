package loop;
/*
 *  Write a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		******
 */
public class Pattern {
	void pattern(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println("\n");
		}

}
	 public static void main(String[] args) {
		Pattern p=new Pattern();
		p.pattern(5);
	}
}
