/**
 * Calculate factorial using recursion method 
 *
 */
public class TestRecursion {

	static long factorial(int n) {
		if(n==1) {
			return 1;
		}
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		
		long f;
		f = factorial(5);
		System.out.println("The result is " + f);
	}

}
