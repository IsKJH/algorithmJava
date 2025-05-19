package algorithm.basic;

import java.util.Scanner;

// 시간 복잡도 테스트 - 빅오표기법
public class SearchNumber {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] numArr = { 20, 40, 60, 70, 90 };
		int cnt = 0;
		System.out.print("숫자입력:");
		int searchNum = key.nextInt();
		System.out.println("숫자입력:" + searchNum);
		for (int num : numArr) {
			cnt++;
			if (num == searchNum) {
				System.out.println(cnt + "회 찾기 성공!!");
			}
		}
		key.close();
	}

}
