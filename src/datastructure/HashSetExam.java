package datastructure;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		list.add(99);
		list.add(100);
		list.add(88);
		list.add(95);
		list.add(45);
		HashSet<Integer> set = new HashSet<>();
		for (int data : list) {
			set.add(data);
		}
		for (int data : set) {
			if (data % 2 == 0) {
				System.out.println(data + "---- (짝수)");
			} else {
				System.out.println(data + "---- (홀수)");
			}
			sum += data;
		}
		System.out.println("총점:" + sum);
		System.out.println("평균:" + sum / set.size());
	}

}
