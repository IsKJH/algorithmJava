package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10951_BufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			String[] arr = br.readLine().split(" ");
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		}
	}
}
