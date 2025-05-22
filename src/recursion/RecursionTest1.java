package recursion;

public class RecursionTest1 {
	public void test(int count) {
		if (count > 10) {
			return;
		}
		System.out.println("재귀알고리즘:" + count);
		test(count + 1);
	}

	public static void main(String[] args) {
		RecursionTest1 obj = new RecursionTest1();
		obj.test(0);
	}

}
