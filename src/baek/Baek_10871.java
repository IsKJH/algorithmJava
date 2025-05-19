package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int size = Integer.parseInt(arr[0]);
		int target = Integer.parseInt(arr[1]);
		String[] arr1 = br.readLine().split(" ");

		for (int i = 0; i < size; i++) {
			if (Integer.parseInt(arr1[i]) < target) {
				bw.write(Integer.parseInt(arr1[i]) + " ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
