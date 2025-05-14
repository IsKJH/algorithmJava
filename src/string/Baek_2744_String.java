package string;

import java.util.Scanner;

public class Baek_2744_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				answer += Character.toLowerCase(str.charAt(i));
			} else {
				answer += Character.toUpperCase(str.charAt(i));
			}
//			if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(i)).toUpperCase())) {
//				answer += String.valueOf(str.charAt(i)).toLowerCase();
//			} else {
//				answer += String.valueOf(str.charAt(i)).toUpperCase();
//			}
		}
		System.out.println(answer);
		sc.close();
	}
}
