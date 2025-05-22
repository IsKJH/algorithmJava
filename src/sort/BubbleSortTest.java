package sort;

import java.util.Arrays;

//버블정렬
//인접한 요소의 값을 비교해서 swap
public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr = { 77, 19, 22, 23, 7, 4, 5 };
		// 버블정렬 알고리즘으로 오름차순 정렬하기
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - i - 1; j++) {
				if (arr[i] > arr[j + i]) {
					int temp = arr[i];
					arr[i] = arr[j + i];
					arr[j + i] = temp;
				}
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr.length - 1; j >= i; j--) {
//				System.out.println("i" + arr[i]);
//				System.out.println("j" + arr[j]);
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.println("=========");
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		System.out.println(Arrays.toString(arr));
	}

}
