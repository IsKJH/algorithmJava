package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split("");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				int num1 = Integer.parseInt(arr[idx]);
				int num2 = Integer.parseInt(arr[j]);
				if (num1 < num2) {
					idx = j;
				}
			}
			String temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
			sb.append(arr[i]);
		}
		System.out.print(sb);
	}
}
