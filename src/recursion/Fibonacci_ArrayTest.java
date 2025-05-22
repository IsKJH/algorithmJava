package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_ArrayTest {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		int num = key.nextInt();

		int[] arr = new int[num + 1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.err.println(Arrays.toString(arr));
		System.out.println(arr[num]);
	}

}
