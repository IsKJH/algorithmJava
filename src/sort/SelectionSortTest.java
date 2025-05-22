package sort;

import java.util.Arrays;

//선택정렬을 이용해서 정렬
public class SelectionSortTest {
	public static void main(String[] args) {
		int[] arr = { 77, 19, 22, 23, 7, 4, 5 };
		// min값에 대한 index를 지정하고 (최초에는 0으로 셋팅)
		// 반복문이 1회 완료가 되면 가장 작은 값을 맨 앞으로 보내기
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("================");
		System.out.println(Arrays.toString(arr));
	}
}
