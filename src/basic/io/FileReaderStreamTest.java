package basic.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderStreamTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			while (true) {
				int data = fr.read();
				if (data == -1) {
					fr.close();
					break;
				}
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일명이 틀렸습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}
