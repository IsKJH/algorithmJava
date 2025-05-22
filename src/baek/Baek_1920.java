package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1920 {

	public static int[] makeArr(String[] arr, int size) {
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = Integer.parseInt(arr[i]);
		}
		return result;
	}

	public static boolean sort(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (target == arr[mid]) {
				return true;
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] intArr = makeArr(arr, N);

		int M = Integer.parseInt(br.readLine());
		String[] arr1 = br.readLine().split(" ");
		int[] intArr1 = makeArr(arr1, M);

		Arrays.sort(intArr);

		for (int i = 0; i < M; i++) {
			boolean chk = sort(intArr, intArr1[i]);
			sb.append(chk ? 1 : 0).append("\n");
		}
		System.out.println(sb);
	}
}
