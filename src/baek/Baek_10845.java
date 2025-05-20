package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		int size = Integer.parseInt(br.readLine());
		for (int i = 0; i < size; i++) {
			String[] arr = br.readLine().split(" ");
			int cnt = 1;
			int result = 0;
			switch (arr[0]) {
			case "push":
				queue.add(Integer.parseInt(arr[1]));
				break;
			case "pop":
				if (queue.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(queue.poll());
				}
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if (queue.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				for (int num : queue) {
					if (cnt == 1) {
						result = num;
						break;
					} else {
						cnt++;
					}
				}
				System.out.println(result);
				break;
			case "back":
				cnt = 1;
				result = 0;
				for (int num : queue) {
					if (cnt == queue.size()) {
						result = num;
						break;
					} else {
						cnt++;
					}
				}
				System.out.println(result);
				break;
			}
		}
		br.close();
	}
}
