package recursion;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println("5!=" + factorial(5));
//		int sum = 1;
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("sum = sum *" + i);
//			sum *= i;
//		}
//		System.out.println("5!=" + sum);
	}

	public static int factorial(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * factorial(i - 1);
		}

	}

}
