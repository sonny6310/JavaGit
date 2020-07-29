package auto;

import org.springframework.context.support.GenericXmlApplicationContext;

import auto.service.MemberService;

public class MainXML {
	public static void main(String[] args) {
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("MyConf.xml");
		MemberService ms = gxac.getBean("memberService", MemberService.class);
		ms.join();
	}
}
