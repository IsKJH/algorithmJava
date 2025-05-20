package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baek_10828 {

	static class StackClass {
		Stack<Integer> stack;
		BufferedWriter bw;

		public StackClass() {
		}

		public StackClass(Stack<Integer> stack, BufferedWriter bw) {
			this.stack = stack;
			this.bw = bw;
		}

		public void push(int num) {
			this.stack.push(num);
		}

		public String pop() throws IOException {
			return this.stack.isEmpty() ? "-1\n" : this.stack.pop() + "\n";

		}

		public String size() throws IOException {
			return this.stack.size() + "\n";
		}

		public String empty() throws IOException {
			return this.stack.isEmpty() ? "1\n" : "0\n";
		}

		public String top() throws IOException {
			return this.stack.isEmpty() ? "-1\n" : this.stack.peek() + "\n";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		StackClass customStack = new StackClass(new Stack<Integer>(), bw);
		for (int i = 0; i < size; i++) {
			String[] arr = br.readLine().split(" ");
			switch (arr[0]) {
			case "push":
				customStack.push(Integer.parseInt(arr[1]));
				break;
			case "pop":
				bw.write(customStack.pop());
				break;
			case "size":
				bw.write(customStack.size());
				break;
			case "empty":
				bw.write(customStack.empty());
				break;
			case "top":
				bw.write(customStack.top());
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
