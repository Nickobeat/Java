/**
 * Test if
 * -------- 
 * Random a number of a dice
 * Print small if the number are 1, 2, 3
 * Print big if the number are 4, 5, 6
 *
 */
public class TestIf {
	public static void main(String[] args) {
		double d = Math.random();
		int e = 1 + (int)(d*6);
		System.out.println(e);
	if(e>3) {
		System.out.println("Big Number!");
	}
	else
		System.out.println("Small Number!");
	} 
}
