/**
 * Test continue method
 * ---------------------
 * Print 1-100 Prime Numbers
 *
 */

public class TestContinue {

	public static void main(String[] args) {
		int count = 0;
		outer: for(int i = 2; i < 100; i++) {
			for(int j = 2; j < i ; j++) {
				if(i % j == 0) {
					continue outer;
				}
			}
			count++;
			System.out.println(i);
		}
		System.out.println("Total is " + count);
	}

}
