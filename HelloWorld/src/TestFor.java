
public class TestFor {

	public static void main(String[] args) {

		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i<=100; i++) {
			sum += i;
			if(i%2!=0) {
				oddSum += i;
			}
			else
				evenSum += i;
		}
		System.out.println("Sum is "+ sum);
		System.out.println("OddSum is "+ oddSum);
		System.out.println("EvenSum is "+ evenSum);
		
		for(int j=1; j<=1000; j++) {
			if(j%5==0) {
				System.out.print(j + "\t");
			if(j%50==0)
				System.out.println();
			}
		}
	}

}
