package baek;

import java.util.Scanner;

public class Baek_10950_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key1 = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < key1; i++) {
			String[] key2 = sc.nextLine().split(" ");
			System.out.println(Integer.parseInt(key2[0]) + Integer.parseInt(key2[1]));
		}
	}
}
