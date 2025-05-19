package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Baek_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		list.sort(Comparator.naturalOrder());
		System.out.println(list.get(0) + " " + list.get(size - 1));
		bw.close();
		br.close();
	}
}
