package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baek_5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= 30; i++) {
			arr.add(i);
		}

		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			if (arr.contains(num)) {
				arr.remove(arr.indexOf(num));
			}
		}
		if (arr.get(0) > arr.get(1)) {
			System.out.println(arr.get(1));
			System.out.println(arr.get(0));
		} else {
			System.out.println(arr.get(0));
			System.out.println(arr.get(1));
		}
	}
}
