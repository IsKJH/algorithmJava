package recursion;

public class RecursionExam2 {

	public static void main(String[] args) {
		printStar(10);
	}

	public static void printStar(int i) {
		if (i == 0) {
			return;
		} else {
			printStar(i - 1);
		}
		System.out.print("*");
	}

}
