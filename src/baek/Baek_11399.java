package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int answer = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int num1 = Integer.parseInt(arr[i]);
				int num2 = Integer.parseInt(arr[j]);
				if (num1 > num2) {
					arr[i] = String.valueOf(num2);
					arr[j] = String.valueOf(num1);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				answer += Integer.parseInt(arr[j]);
			}
		}
		System.out.println(answer);
	}
}
