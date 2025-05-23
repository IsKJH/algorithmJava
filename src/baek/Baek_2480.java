package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);
		} else if (a == b || a == c || b == c) {
			if (b == c) {
				System.out.println(1000 + b * 100);
			} else {
				System.out.println(1000 + a * 100);
			}
		} else {
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}
	}
}
