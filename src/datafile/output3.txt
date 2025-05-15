package basic.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//파일로부터 읽기 - byte단위로 읽기
public class FileReaderTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		// 1. 파일오픈(OS와 통신하면서 파일리소스를 사용할 수 있도록 허가)
		// -----------------------------------------
		// OS와 통신하거나 파일을 오픈하는 작업은 FileInputStream생성자에
		// 구현
		FileReader fi = new FileReader("src/datafile/test.txt");
		// 2. 파일액세스
		while (true) {
			int data = fi.read();
			// 파일의 끝이 되면 즉, 더이상 읽을 내용이 없으면 -1을 리턴
			if (data == -1) {
				break;
			}
			System.out.print((char) data);
		}

	}
}
