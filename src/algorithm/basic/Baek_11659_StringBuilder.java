package algorithm.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_11659_StringBuilder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int size = Integer.parseInt(arr[1]);
		String[] arr1 = br.readLine().split(" ");
		int[] arr2 = new int[Integer.parseInt(arr[0]) + 1];
		for (int i = 1; i < arr2.length; i++) {
			arr2[i] = arr2[i - 1] + Integer.parseInt(arr1[i - 1]);
		}
		// System.out.println();이 리소스를 많이 사용하기 때문에 실행시간이 더 걸린다. 이를 최적화 하기 위해서
		// 출력할 구간합을 하나의 문자열로 만들어서 한 번만 sysout으로 출력하기
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			String[] arr3 = br.readLine().split(" ");
			sb.append(arr2[Integer.parseInt(arr3[1])] - arr2[Integer.parseInt(arr3[0]) - 1]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
