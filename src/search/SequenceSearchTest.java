package search;

import java.util.Scanner;

//선형검색
public class SequenceSearchTest {

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

	// searchValue의 위치를 리턴, 없으면 -1을 리턴
	// arr은 찾으려고 하는 값이 저장된 배열
	// searchValue가 실제 찾는 값
	public static int search(int[] arr, int searchValue) {
		int result = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				result = i;
			}
		}
		return result;
	}
}
