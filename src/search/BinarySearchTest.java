package search;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = { 77, 19, 22, 23, 7, 4, 5 };
		Scanner key = new Scanner(System.in);
		System.out.println("찾을 숫자:");
		int searchValue = key.nextInt();
		int position = search(arr, searchValue);
		if (position == -1) {
			System.out.println("찾는 데이터가 없습니다.");
		} else {
			System.out.println("데이터의 위치:" + position);
		}
		key.close();
	}

	public static int search(int[] arr, int searchValue) {
		int result = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int num1 = 0;
		int num2 = arr.length - 1;
		while (num1 <= num2) {
			int num3 = (num1 + num2) / 2;
			if (arr[num3] == searchValue) {
				result = num3;
				return result;
			} else if (arr[num3] < searchValue) {
				num1 = num3 + 1;
			} else {
				num2 = num3 - 1;
			}
		}
		for (int i : arr) {

		}
		return result;
	}
}
