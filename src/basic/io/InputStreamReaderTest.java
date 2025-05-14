package basic.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStream 클래스 테스트
//~~~~~InputStraeam의 최상위 클래스
public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStream myin = System.in;
		InputStreamReader reader = new InputStreamReader(myin);
		// 키보드로 입력하는 데이터를 읽기 - read메소드
		try {
			// read는 키보드로 입력되는 데이터를 한 바이트 읽어서 리턴
			while (true) {
				int data = reader.read();// 예외가 발생할 수 있는 코드
				if (data == 10) {
					break;
				}
				System.out.print((char) data);
			}

		} catch (IOException e) {
			System.out.println("입력오류...");
			e.printStackTrace();
		}
	}
}
