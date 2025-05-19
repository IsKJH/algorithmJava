package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_2018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int cnt = 1;
		int answer = 0;
		for (int i = cnt; i <= N;) {
			sum += i;
			if (sum < N) {
				i++;
			} else {
				if (sum == N) {
					answer++;
				}
				cnt++;
				i = cnt;
				sum = 0;

			}
		}
		bw.write(String.valueOf(answer));
		bw.flush();
		br.close();
		bw.close();
	}
}