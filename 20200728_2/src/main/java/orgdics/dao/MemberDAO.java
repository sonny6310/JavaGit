package orgdics.dao;

import orgdics.dto.MemberDTO;

public class MemberDAO {

	public boolean selectById(String string) {
		System.out.println("id중복확인");
		return true;
	}

	public void insert(MemberDTO memberDTO) {
		System.out.println("memberDTO 생성");
	}
}
