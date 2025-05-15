package basic.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

	public static void main(String args[]) throws IOException {

		Grade grade = new Grade();

		String fileName = "src/datafile/score.txt";
		grade.printGrade(fileName);

	}

	public void printGrade(String fileName) throws IOException {

		/* 이곳에 프로그램을 완성하십시오. */
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String data = "";
			int sum = 0;
			int avg = 0;
			int cnt = 0;
			while ((data = br.readLine()) != null) {
				String[] arr = data.split(",");
				System.out.println(arr[0] + "의 점수는 " + arr[1] + "점 입니다. ");
				sum += Integer.parseInt(arr[1]);
				cnt++;
			}
			System.out.println("모두의 총점은 " + sum + "점 입니다.");
			System.out.println("모두의 평균은 " + sum / cnt + "점 입니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}