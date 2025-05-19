package datastructure;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		int[] myarr = { 10, 20, 30, 40 };
		Stack<Integer> stack = new Stack<Integer>();
		for (int num : myarr) {
			stack.push(num);
		}
		while (stack.size() != 0) {
			System.out.println(stack.pop());
		}
	}

}
