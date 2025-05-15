package basic.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/basic/io/FIleReaderTest.java");
		FileWriter fw = new FileWriter("src/datafile/output3.txt");
		int data = 0;
		int count = 0;
		long startTime = System.nanoTime();
		while ((data = fr.read()) != -1) {
			fw.write(data);
//			System.out.print((char) data);
			count++;
		}
		long endTime = System.nanoTime();
		System.out.println("실행횟수=>" + count);
		System.out.println("실행시간=>" + (endTime - startTime));
		fr.close();
		fw.close();
	}

}
