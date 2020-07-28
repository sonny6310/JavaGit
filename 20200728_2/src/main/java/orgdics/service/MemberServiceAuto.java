package orgdics.service;

import org.springframework.beans.factory.annotation.Autowired;

import orgdics.dao.MemberDAO;
import orgdics.dto.MemberDTO;

public class MemberServiceAuto {
	
	@Autowired
	MemberDAO memberDao;
	
	public void memberjoin(String id) {
		boolean test = memberDao.selectById(id);
		if (test) {
			memberDao.insert(new MemberDTO());
		} else {

		}
	}
}
