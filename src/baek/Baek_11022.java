package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] arr = br.readLine().split(" ");
			int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			bw.write("Case #" + (i + 1) + ": " + arr[0] + " + " + arr[1] + " = " + sum);
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
