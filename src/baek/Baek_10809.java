package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str = br.readLine();
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (arr[(int) str.charAt(i) - 97] == -1) {
				arr[(int) str.charAt(i) - 97] = i;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (i != 25) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i]);
			}

		}
	}
}