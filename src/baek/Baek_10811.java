package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_10811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] arr = br.readLine().split(" ");
		int[] basket = new int[Integer.parseInt(arr[0])];
		Arrays.setAll(basket, index -> index + 1);
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			String[] reverse = br.readLine().split(" ");

			for (int j = Integer.parseInt(reverse[0]); j < Integer.parseInt(reverse[1]) - 1; j++) {
				int temp = basket[i];
				basket[i] = basket[i + 1];
				basket[i + 1] = temp;
			}
			System.out.println(Arrays.toString(basket));
		}

	}
}
