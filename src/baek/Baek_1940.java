package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int target = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int startIdx = 0;
		int endIdx = 1;
		int cnt = 0;
		while (startIdx + 1 != size) {
			int num1 = Integer.parseInt(arr[startIdx]);
			int num2 = Integer.parseInt(arr[endIdx]);
			if (num1 + num2 == target) {
				cnt++;
				startIdx++;
				endIdx = startIdx + 1;
			} else if (endIdx + 1 == size) {
				startIdx++;
				endIdx = startIdx + 1;
			} else if (endIdx + 1 != size) {
				endIdx++;
			} else if (startIdx + 1 == size) {
				break;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}
