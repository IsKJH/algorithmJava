package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1 - i; j++) {
				if (arr[i] > arr[j + i]) {
					int temp = arr[i];
					arr[i] = arr[j + i];
					arr[j + i] = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}
