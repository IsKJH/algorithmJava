package datastructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("mysql");
		list.add("github");
		list.add("linux");
		list.add("algorithm");
		list.add("algorithm");
		System.out.println("사이즈=>" + list.size());
		display(list);
		// 업데이트 - 4번 요소의 값을 수정
		list.set(4, "spring & spring boot");
		display(list);
		// 마지막에 삽입하기
		list.add("android");
		display(list);
		// 중간에 삽입하기
		list.add(3, "javascript");
		display(list);
		// 지우기
		list.remove(1);// 1번 index에 해당하는 요소를 삭제
		display(list);
		// 동일한 요소가 저장된 경우
		list.add("javascript");
		display(list);
		list.remove("javascript");// 저장된 객체 중 지정해서 삭제
		display(list);

		System.out.println(list.contains("java"));
		System.out.println(list.contains("hadoop"));
		System.out.println(list.isEmpty());
	}

	// ArraList의 요소를 출력하는 메소드
	private static void display(List<String> list) {
		System.out.println("=============");
		for (String data : list) {
			System.out.println(data);
		}
		System.out.println("사이즈=>" + list.size());
	}
}
