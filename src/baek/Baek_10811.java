package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] arr = br.readLine().split(" ");

		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);

		int[] basket = new int[n];

		for (int i = 0; i < n; i++) {
			basket[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			String[] range = br.readLine().split(" ");
			int start = Integer.parseInt(range[0]) - 1;
			int end = Integer.parseInt(range[1]) - 1;

			for (int j = 0; j < (end - start + 1) / 2; j++) {
				int temp = basket[start + j];
				basket[start + j] = basket[end - j];
				basket[end - j] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			sb.append(basket[i]);
			if (i < n - 1)
				sb.append(" ");
		}

		System.out.println(sb.toString());
	}
}