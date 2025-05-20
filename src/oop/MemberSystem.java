package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSystem {
	static MemberMgr mgr;

	public static void main(String[] args) {

		init();
		Scanner key = new Scanner(System.in);
		while (true) {
			System.out.println("*********인사관리시스템********");
			System.out.println("1. 로그인");
			System.out.println("2. 회원등록");
			System.out.println("3. 회원조회");
			System.out.println("4. 회원정보수정");
			System.out.println("5. 종료");
			int num = key.nextInt();
			switch (num) {
			case 1:
			case 2:
				System.out.println("아이디:");
				String id = key.next();
				System.out.println("이름:");
				String name = key.next();
				System.out.println("나이:");
				int age = key.nextInt();
				mgr.add(new Member(id, name, age));
				break;
			case 3:
				mgr.print();
				break;
			case 4:
			case 5:
				System.exit(0);
			}
		}

	}

	public static void init() {
		// Member클래스를 임의로 5개 저장될 수 있도록 구현하세요
		// mgr = new MemberMgr(배열);
		ArrayList<Member> memberlist = new ArrayList<Member>();
		memberlist.add(new Member("V", "뷔", 30));
		memberlist.add(new Member("RM", "알엠", 30));
		memberlist.add(new Member("JG", "정국", 30));
		memberlist.add(new Member("J", "진", 30));
		memberlist.add(new Member("SG", "슈가", 30));
		mgr = new MemberMgr(memberlist);
	}
}
