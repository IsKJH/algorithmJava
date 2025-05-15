package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int hour = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);
		int time = Integer.parseInt(br.readLine());
		int totalMinute = (hour * 60) + minute + time;
		hour = (totalMinute / 60) % 24;
		minute = totalMinute % 60;
		System.out.print(hour + " " + minute);
	}
}
