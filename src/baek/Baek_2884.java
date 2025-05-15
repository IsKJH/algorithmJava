package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int hour = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);
		minute -= 45;
		if (minute < 0) {
			minute += 60;
			hour--;
			if (hour < 0) {
				hour = 23;
			}
		}
		System.out.println(hour + " " + minute);
		br.close();
	}
}
