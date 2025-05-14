package string;

import java.util.Scanner;

public class Baek_1543_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int cnt = 0;
		boolean chk = true;
		while (chk) {
			if (str1.contains(str2)) {
				str1 = str1.substring(str1.indexOf(str2) + str2.length());
				cnt++;
			} else {
				chk = false;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
