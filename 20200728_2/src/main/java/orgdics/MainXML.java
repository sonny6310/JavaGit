package orgdics;

import org.springframework.context.support.GenericXmlApplicationContext;

import orgdics.service.MemberService;

public class MainXML {
	public static void main(String[] args) {
//		MemberService ms = new MemberService(new MemberDAO());
//		ms.memberjoin("aaa");
//		↓ 싱글톤으로
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("MemberConf.xml");
		MemberService ms = gxac.getBean("memberService",MemberService.class);
		ms.memberjoin("aaa");
	}
}
