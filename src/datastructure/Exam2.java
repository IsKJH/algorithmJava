package datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Exam2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> arr = new ArrayList<String>();
		arr.addAll(compareFile("src1", "src2"));
		for (int i = 0; i < arr.size(); i++) {
			bw.write(arr.get(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();

	}

	public static ArrayList<String> compareFile(String file1, String file2) throws IOException {
		ArrayList<String> arr = new ArrayList<String>();
		BufferedReader br1 = new BufferedReader(new FileReader("src/datafile/" + file1 + ".txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("src/datafile/" + file2 + ".txt"));
		while (br1.ready() && br2.ready()) {
			String txt1 = "";
			String txt2 = "";
			txt1 = br1.readLine();
			txt2 = br2.readLine();
			if (txt1.equals(txt2)) {
				arr.add(txt1);
			}
		}
		br1.close();
		br2.close();
		return arr;
	}
}