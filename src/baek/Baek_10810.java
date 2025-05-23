package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int[] basket = new int[Integer.parseInt(arr[0])];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			String[] arr1 = br.readLine().split(" ");
			int num1 = Integer.parseInt(arr1[0]);
			int num2 = Integer.parseInt(arr1[1]);
			int num3 = Integer.parseInt(arr1[2]);
			for (int j = num1 - 1; j <= num2 - 1; j++) {
				basket[j] = num3;
			}
		}
		for (int num : basket) {
			sb.append(num + " ");
		}
		System.out.println(sb);
	}
}
