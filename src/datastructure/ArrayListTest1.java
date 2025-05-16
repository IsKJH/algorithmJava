package datastructure;

import java.util.ArrayList;

public class ArrayListTest1 {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<Integer>(); // int[] arr = new int[10]
		System.out.println("현재 ArrayList에 저장된 요소의 갯수=>" + v.size()); // arr.length

		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("현재 ArrayList에 저장된 요소의 갯수=>" + v.size()); // arr.length

		System.out.println("0번 index번째 저장된 요소는=>" + v.get(0)); // sysout(arr[0])

		for (int i = 0; i < v.size(); i++) {
			int data = v.get(i);
			System.out.println(i + "번째 요소=>" + data);
		}
		System.out.println("========================");
		for (int data : v) {
			System.out.print(data);
		}
	}
}
