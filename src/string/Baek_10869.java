package string;

import java.util.Scanner;

public class Baek_10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		System.out.println(Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]));
		sc.close();
	}
}
