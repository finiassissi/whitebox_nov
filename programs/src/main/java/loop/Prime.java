package loop;

/*
 *  Write a program  to check if a given number is prime or not.
 */
public class Prime {
	boolean primeornot(int num) {
		if (num == 0 || num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Prime obj = new Prime();
		System.out.println(obj.primeornot(10));
		System.out.println(obj.primeornot(3));
		System.out.println(obj.primeornot(0));
		System.out.println(obj.primeornot(5));
	}
}
