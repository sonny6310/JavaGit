package orgdics;

import orgdics.dao.MemberDAO;
import orgdics.dao.OracleMemberDAO;
import orgdics.service.MemberService;

public class Main {
	public static void main(String[] args) {
//		MemberService ms = new MemberService(new MemberDAO());
//		ms.memberjoin("aaa");
//		mssql(memberDAO)쓰다가 oracle로 바꾸고싶을 때 바꾸는 방법 ↓
		MemberService ms = new MemberService(new OracleMemberDAO());
		ms.memberjoin("aaa");
		
		
	}
}
