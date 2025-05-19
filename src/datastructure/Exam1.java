package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Exam1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("oracle");
		list.add("servlet");
		list.add("jsp");
		list.add("spring");

		// List -> Map으로 변환
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < list.size(); i++) {
			map.put("mymap" + i, list.get(i));
		}
		// => map의 key : "mymap"+i
		Set<String> key = map.keySet();
		for (String k : key) {
			System.out.println(map.get(k));
		}
	}
}
