package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10950_BufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int key1 = Integer.parseInt(br.readLine());
		for (int i = 0; i < key1; i++) {
			String[] arr = br.readLine().split(" ");
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		}
	}
}
