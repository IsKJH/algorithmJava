package recursion;

public class RecursionExam1 {

	public static void main(String[] args) {
		int result = length("java");
		System.out.println("문자열의 길이: " + result);
	}

	public static int length(String str) {
		if (str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}
}
