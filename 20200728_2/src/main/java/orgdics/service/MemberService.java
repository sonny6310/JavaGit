package orgdics.service;

import orgdics.dao.MemberDAO;
import orgdics.dto.MemberDTO;

public class MemberService {

	MemberDAO dao;
	private String version;

	// 생성자를 통한 di 의존 주입
	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}

	public MemberService() {

	}

	// setter getter를 통한 di 의존 주입
	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void memberjoin(String id) {
		boolean test = dao.selectById(id);
		if (test) {
			dao.insert(new MemberDTO());
		} else {

		}
	}
}
