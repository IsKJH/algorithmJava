package baek;

import java.util.Scanner;

public class Baek_9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println((key <= 100 && key > 89) ? "A"
				: (key <= 89 && key > 79) ? "B" : (key <= 79 && key > 69) ? "C" : (key <= 69 && key > 59) ? "D" : "F");
	}
}
