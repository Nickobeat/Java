/**
 * Test for method 
 * ----------------
 * Test 9*9 Multiplication Table
 *
 */

public class TestForTable {

	public static void main(String[] args) {
		System.out.println("9*9 Multiplication Table");
		System.out.println("---------------------------------------------------------------------------");
		for(int i=1; i<10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+ "="+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
