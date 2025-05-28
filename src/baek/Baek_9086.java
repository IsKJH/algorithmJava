package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for (int i = 0; i < Integer.parseInt(str); i++) {
			String str1 = br.readLine();
			System.out.println(String.valueOf(str1.charAt(0)) + String.valueOf(str1.charAt(str1.length() - 1)));
		}
	}
}