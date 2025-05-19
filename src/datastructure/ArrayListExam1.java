package datastructure;

import java.util.ArrayList;

public class ArrayListExam1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			list.add((int) (Math.random() * 100) + 1);
			if (list.get(i) % 2 == 0) {
				System.out.println(list.get(i) + "---- (짝수)");
			} else {
				System.out.println(list.get(i) + "---- (홀수)");
			}
			sum += list.get(i);
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum / list.size());
	}
}
