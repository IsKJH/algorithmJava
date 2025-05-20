package algorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//MyStack내부에 데이터를 저장하기 위한 공간
class MyStack {
	private int[] mystack;
	// 스택의top의 위치값 - top_position의 변수의 값이 0이라는 것은 스택이 비어있다는 의미
	private int top_position;

	public MyStack(int size) {
		mystack = new int[size];
	}

	public void push(int data) {
		mystack[top_position] = data;
		top_position++;
	}

	// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	public int empty() {
		int result = 0;
		if (top_position == 0) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}

	// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop() {
		int result = 0;
		if (empty() == 1) {// 비어있음
			result = -1;
		} else {
			result = mystack[top_position - 1];
			top_position = top_position - 1;
		}
		return result;
	}

	public int top() {
		int result = 0;
		if (empty() == 1) {// 비어있음
			result = -1;
		} else {
			result = mystack[top_position - 1];
		}
		return result;

	}

	public int size() {
		return top_position;
	}
}

public class Baek_10828_Stack {
	public static void main(String[] args) throws IOException {
		// MyStack의 메소드를 호출해서 테스트케이스 데이터를 입력 받아서 처리하면 출력결과대로 출력되도록 작업
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		MyStack stack = new MyStack(count);
		// 각 경우에 따라서 MyStack의 메소드를 호출
		// 각 출력하는 값은 StringBuilder로 만들어서 for문 밖에서 한 번에 출력
		for (int i = 1; i <= count; i++) {
			String line = br.readLine();
			String[] arr = line.split(" ");
			switch (arr[0]) {
			case "push":
				stack.push(Integer.parseInt(arr[1]));
				break;
			case "pop":
				sb.append(stack.pop() + "\n");
				break;
			case "empty":
				sb.append(stack.empty() + "\n");
				break;
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "top":
				sb.append(stack.top() + "\n");
				break;
			}
		}
		System.out.println(sb);
	}

}
