package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob {
	static BookMgr mgr;

	public static void main(String[] args) {
		// 책 초기화하기
//		Prob booksystem = new Prob();
//		booksystem.init();
		init();
		Scanner key = new Scanner(System.in);
		while (true) {
			System.out.println("*********서점시스템*********");
			System.out.println("1. 로그인");
			System.out.println("2. 책등록");
			System.out.println("3. 책조회");
			System.out.println("4. 책정보수정");
			System.out.println("5. 종료");
			System.out.println("원하는 작업을 선택하세요:");
			int job = key.nextInt();
			if (job == 2) {
				System.out.println("책제목:");
				String title = key.next();
				System.out.println("가격:");
				int price = key.nextInt();
				System.out.println("장르:");
				String category = key.next();
				mgr.addBook(new ITBook(title, price, category));
			} else if (job == 3) {
				mgr.print();
			} else if (job == 5) {
				System.exit(0);
			}
		}

	}

	public static void init() {
		ArrayList<Book> booklist = new ArrayList<Book>();
		booklist.add(new ITBook("java프로그램", 23000, "java"));
		booklist.add(new ITBook("안드로이드로 앱 만들기", 25000, "android"));
		booklist.add(new ITBook("재미있는 스프링", 30000, "java"));
		booklist.add(new ITBook("파이썬으로 AI익히기", 23000, "python"));
		booklist.add(new ITBook("서블릿jsp", 23000, "java"));
		mgr = new BookMgr(booklist);
	}
}
