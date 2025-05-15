package baek;

import java.util.Scanner;

public class Baek_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		String[] arr1 = str1.split("");
		int A = Integer.parseInt(str);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(A * Integer.parseInt(arr1[arr1.length - 1 - i]));
		}
		System.out.println(A * Integer.parseInt(str1));
		sc.close();
	}
}
