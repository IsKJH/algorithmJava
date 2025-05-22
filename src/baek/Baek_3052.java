package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baek_3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			set.add(num % 42);
		}
		sb.append(set.size());
		System.out.println(sb);
	}
}
