package baek;

import java.util.Scanner;

public class Baek_10998 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
		sc.close();
	}
}
