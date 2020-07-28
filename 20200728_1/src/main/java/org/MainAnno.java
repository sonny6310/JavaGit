package org;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnno {
	public static void main(String[] args) {

//		또 다른 spring 싱글톤 방식. spring 5버전에서 새로 나옴. (A.java 만들고, MyConf.java에서 A에 @bean 처리.
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConf.class);
		A a = acac.getBean("a", A.class);
		System.out.println("a.getName = " + a.getName());
		a.setName("테스트");
		System.out.println("a.getName = " + a.getName());

		A a1 = acac.getBean("a", A.class);
		System.out.println("a1.getName = " + a1.getName());
		System.out.println("a랑 a1이랑 같나요? " + a.equals(a1));
	}
}