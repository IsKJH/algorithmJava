package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split("");
		String[] tempArr = new String[2];
		boolean chk = true;
		for (int i = 0; i < arr.length; i++) {
			if (chk == true) {
				tempArr[0] = arr[i];
			} else {
				tempArr[1] = arr[i];
			}
			chk = !chk;
			if (!tempArr[0].equals(tempArr[1])) {
				System.out.println("레이저");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
