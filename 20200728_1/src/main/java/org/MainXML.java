package org;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXML {
	public static void main(String[] args) {

//		@Autowired랑 다른 방식으로
//		spring 싱글톤. MyConf.xml에서 <bean class="싱글톤으로 쓸 java파일 패키지명.java파일명" name="호출이름"></bean>
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("MyConf.xml");
		A a = gxac.getBean("a", A.class);
		System.out.println("a.getName = " + a.getName());
		a.setName("테스트");
		System.out.println("a.getName = " + a.getName());

		A a1 = gxac.getBean("a", A.class);
		System.out.println("a1.getName = " + a1.getName());
		System.out.println("a랑 a1이랑 같나요? " + a.equals(a1));
	}
}
