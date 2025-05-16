package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Baek_25304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < N; i++) {
			String arr[] = br.readLine().split(" ");
			sum += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
		}
		if (sum == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		br.close();
	}
}
