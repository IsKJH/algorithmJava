package baek;

import java.util.Scanner;

public class Baek_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		String[] arr = key.split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		System.out.println(A > B ? ">" : A < B ? "<" : "==");
	}
}
