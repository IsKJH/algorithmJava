package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_11659_PrefixSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int size = Integer.parseInt(arr[1]);
		String[] arr1 = br.readLine().split(" ");
		int[] arr2 = new int[Integer.parseInt(arr[0]) + 1];
		for (int i = 1; i < arr2.length; i++) {
			arr2[i] = arr2[i - 1] + Integer.parseInt(arr1[i - 1]);
		}
		for (int i = 0; i < size; i++) {
			String[] arr3 = br.readLine().split(" ");
			bw.write(String.valueOf(arr2[Integer.parseInt(arr3[1])] - arr2[Integer.parseInt(arr3[0]) - 1]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
