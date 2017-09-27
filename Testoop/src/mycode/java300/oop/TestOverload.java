package mycode.java300.oop;
/**
 * Test Overload
 * 
 * Same function name(add), but different parameter list
 * Also works in constructor
 * 
 */
public class TestOverload {

	public static void main(String[] args) {
		MyMath m = new MyMath();
		int result = m.add(4.2, 8);
		System.out.println(result);
	}

}

class MyMath{
	int a;
	int b;
	public MyMath() {
		
	}
	
	public MyMath(int a) {
		this.a = a;
	}
	
	public MyMath(int b, int a) {
		this.b = b;
		this.a = a;				
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int add(double a, int b) {
		return (int)(a + b);
	}
	
	public int add(int b, double a) {
		return (int)(a + b);
	}
}
