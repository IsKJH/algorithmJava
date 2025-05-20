package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		for (int i = 0; i < size; i++) {
			String[] arr = br.readLine().split("");
			int cnt = 0;
			boolean chk = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("(")) {
					cnt++;
				} else {
					cnt--;
				}
				if (cnt < 0) {
					chk = false;
					break;
				}
			}
			if (cnt != 0) {
				chk = false;
			}
			System.out.println(chk ? "YES" : "NO");
		}
	}
}
