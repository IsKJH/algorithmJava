package baek;

import java.util.Scanner;

public class Baek_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		if ((key % 4 == 0 && key % 100 != 0) || key % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		sc.close();
	}
}
