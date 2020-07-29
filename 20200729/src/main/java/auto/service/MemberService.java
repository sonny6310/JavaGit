package auto.service;

import auto.dao.MemberDAO;

public class MemberService {
	MemberDAO memberDao;
	
	public MemberService() {
		
	}
	
	public MemberService(MemberDAO memberDao) {
		super();
		this.memberDao = memberDao;
	}

	public MemberDAO getMemberDao() {
		return memberDao;
	}

	
	public void setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void join() {
		memberDao.select();
		memberDao.insert();
	}
}
