package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		int stickCnt = 0;
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(") && arr[i + 1].equals(")")) {
				answer += stickCnt;
				i++;
			} else if (arr[i].equals("(")) {
				stickCnt++;
			} else if (arr[i].equals(")")) {
				stickCnt--;
				answer += 1;
			}
		}
		System.out.println(answer);
		br.close();
	}
}
