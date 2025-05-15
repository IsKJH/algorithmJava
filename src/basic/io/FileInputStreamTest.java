package basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일로부터 읽기 - byte단위로 읽기
public class FileInputStreamTest {
	public static void main(String[] args) {
		// 1. 파일오픈(OS와 통신하면서 파일리소스를 사용할 수 있도록 허가)
		// OS와 통신하거나 파일을 오픈하는 작업은 FileInputStream생성자에 구현
		try {
			FileInputStream fi = new FileInputStream("test.txt");
			// 2.파일엑세스
			while (true) {
				int data = fi.read();
				if (data == -1) {
					break;
				}
				System.out.print((char) data);
			}

		} catch (FileNotFoundException e) { // 파일오픈할때 오류발생
			System.out.println("파일명이 틀렸습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}
