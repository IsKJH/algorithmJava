package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int size = Integer.parseInt(arr[1]);
		String[] arr1 = br.readLine().split(" ");
		for (int i = 0; i < size; i++) {
			int sum = 0;
			String[] arr2 = br.readLine().split(" ");
			for (int j = Integer.parseInt(arr2[0]) - 1; j < Integer.parseInt(arr2[1]); j++) {
				sum += Integer.parseInt(arr1[j]);
			}
			bw.write(String.valueOf(sum));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
