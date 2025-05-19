package baek;

import java.util.Scanner;

public class Baek_2018_TwoPointer {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		int startIndex = 1; // 시작포인터
		int endIndex = 1;// 종료포인터
		int sum = 1;
		int count = 1; // 가짓수를 체크하는 변수, 기준값이 포함되어 있으므로(연속된 자릿수의 값을 더해서
						// num이 된다고 했을때 값 1개도 하나의 case가 될 수 있으므로)
		while (endIndex != num) {
			if (sum < num) { // 구간의 합이 입력 받은 숫자 num보다 작은 경우
				endIndex++;
				sum += endIndex;
			} else if (sum == num) { // 구간의 합이 입력 받은 숫자 num과 같은 경우
				count++;
				endIndex++;
				sum = sum + endIndex;
			} else {// 구간의 합이 입력 받은 숫자 num보다 큰 경우
				sum -= startIndex;
				startIndex++;
			}
		}
		System.out.println(count);
	}
}
