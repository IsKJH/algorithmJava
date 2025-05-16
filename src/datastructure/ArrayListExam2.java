package datastructure;

import java.util.ArrayList;

public class ArrayListExam2 {
	public static void main(String[] args) {
		String[] strArr = { "java", "servlet", "jsp", "spring" };
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(changeArrayList(strArr));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	
	}

	public static ArrayList<String> changeArrayList(String[] arr) {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			temp.add(arr[i]);
		}
		return temp;
	}
}
