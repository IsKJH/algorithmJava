package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int num = 0;
		for (int i = 1; i <= 9; i++) {
			int data = Integer.parseInt(br.readLine());
			if (data > num) {
				num = data;
				cnt = i;
			}
		}
		System.out.println(num);
		System.out.println(cnt);
	}
}
