package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Baek_25314 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 0; i < N / 4; i++) {
			str += "long ";
		}
		System.out.println(str + "int");
		br.close();
	}
}
