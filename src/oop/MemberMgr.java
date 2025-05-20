package oop;

import java.util.List;

public class MemberMgr {
	private List<Member> memberlist;

	public void add(Member member) {
		memberlist.add(member);
	}

	public void print() {
		for (Member member : memberlist) {
			System.out.println("아이디: " + member.getId() + ", 이름: " + member.getName() + ", 나이: " + member.getAge());
		}
	}

	public MemberMgr() {
		super();
	}

	public MemberMgr(List<Member> memberlist) {
		super();
		this.memberlist = memberlist;
	}

	public List<Member> getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(List<Member> memberlist) {
		this.memberlist = memberlist;
	}

	@Override
	public String toString() {
		return "MemberMgr [memberlist=" + memberlist + "]";
	}

}
