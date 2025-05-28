package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals("")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}