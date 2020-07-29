package auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import auto.conf.MyCtx;
import auto.service.MemberService;

public class MainAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyCtx.class);
		MemberService ms = acac.getBean("memberService",MemberService.class);
		ms.join();
	}
}
