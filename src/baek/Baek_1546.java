package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		Double[] arr1 = new Double[arr.length];
		Double max = 0.0;
		Double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = Double.parseDouble(arr[i]);
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i] / max * 100;
			sum += arr1[i];
		}

		System.out.println(sum / num);
	}
}