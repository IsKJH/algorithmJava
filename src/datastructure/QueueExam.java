package datastructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] arr = new int[10];
		for (int i = 1; i <= 10; i++) {
			queue.add(i);
			arr[i - 1] = queue.poll();
		}
		System.out.println(Arrays.toString(arr));

	}

}
