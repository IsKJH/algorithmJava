package recursion;

import java.util.Scanner;

public class FibonacciRecursionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		int result = getFibonacci(num);
		System.out.println(result);
	}

	public static int getFibonacci(int i) {
		if (i == 1) {
			return 1;
		} else if (i == 0) {
			return 0;
		} else {
			return getFibonacci(i - 1) + getFibonacci(i - 2);
		}
	}

}
