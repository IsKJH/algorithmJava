package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baek_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int size = Integer.parseInt(br.readLine());
		for (int i = 0; i < size; i++) {
			String[] arr = br.readLine().split(" ");
			if (arr[0].equals("push")) {
				stack.push(Integer.parseInt(arr[1]));
			}
			if (arr[0].equals("top")) {
				if (stack.isEmpty()) {
					bw.write(String.valueOf(-1));
				} else {
					bw.write(String.valueOf(stack.lastElement()));
				}
				bw.newLine();
			}
			if (arr[0].equals("size")) {
				bw.write(String.valueOf(stack.size()));
				bw.newLine();
			}
			if (arr[0].equals("empty")) {
				if (stack.isEmpty()) {
					bw.write(String.valueOf(1));

				} else {
					bw.write(String.valueOf(0));
				}
				bw.newLine();
			}
			if (arr[0].equals("pop")) {
				if (stack.isEmpty()) {
					bw.write(String.valueOf(-1));
				} else {
					bw.write(String.valueOf(stack.pop()));
				}
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}