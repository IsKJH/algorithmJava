package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		int size = Integer.parseInt(br.readLine());
		for (int i = 1; i <= size; i++) {
			queue.add(i);
		}
		while (queue.size() != 1) {
			queue.poll();
			int num = queue.poll();
			queue.add(num);
		}
		System.out.println(queue.peek());
		br.close();
	}
}
