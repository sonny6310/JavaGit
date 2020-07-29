package auto.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import auto.dao.MemberDAO;
import auto.service.MemberService;

@Configuration
public class MyCtx {

	@Bean
	public MemberDAO memberDao() {
		return new MemberDAO();
	}
	
	@Bean
	public MemberService memberService() {
		MemberService ms = new MemberService();
		ms.setMemberDao(memberDao());
		return ms;
	}
}
