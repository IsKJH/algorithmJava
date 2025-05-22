package recursion;

public class RecursionExam3 {

	public static void main(String[] args) {
		System.out.println(sum(10));
	}

	public static int sum(int i) {
		if (i == 0) {
			return 0;
		} else {
			return i + sum(i - 1);

		}
	}

}
