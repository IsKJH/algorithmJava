package recursion;

import java.util.Scanner;

public class FibonacciRecursionTest_Memorization {
	static int[] myarr;

	public static int getFibonacci(int num) {
		if (myarr[num] > 0) {
			return myarr[num];
		}
		if (num == 1 || num == 2) {
			return myarr[num] = 1;
		} else if (num == 0) {
			return 0;

		} else {
			return myarr[num] = getFibonacci(num - 1) + getFibonacci(num - 2);
		}
	}

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		myarr = new int[num + 1];
		int result = getFibonacci(num);
		System.out.println(result);
		key.close();
	}

}
