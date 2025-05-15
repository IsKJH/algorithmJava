package baek;

import java.util.Scanner;

public class Baek_10951_Scanner {

	public static void main(String[] args) {
		Scanner key1 = new Scanner(System.in);
		while (key1.hasNextInt()) {
			String[] key2 = key1.nextLine().split(" ");
			System.out.println(Integer.parseInt(key2[0]) + Integer.parseInt(key2[1]));
		}
	}
}
