package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10813 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int[] basket = new int[Integer.parseInt(arr[0])];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			String[] arr1 = br.readLine().split(" ");
			int num1 = Integer.parseInt(arr1[0]) - 1;
			int num2 = Integer.parseInt(arr1[1]) - 1;
			int temp = basket[num1];
			basket[num1] = basket[num2];
			basket[num2] = temp;
		}
		for (int num : basket) {
			sb.append(num + " ");
		}
		System.out.println(sb);
	}
}
