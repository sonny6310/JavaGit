package cc.dd;

public class AA {
	// 다른 패키지에 있으므로 같은 java파일명이 생성가능하다.
	public AA(){	// aa.bb.AA 기본생성자 쓸 때는 public 없어도 됐었는데?
					// 
		System.out.println("cc.dd.AA클래스의 기본생성자");
	}
	public void doA() {
		System.out.println("cc.dd.AA.doA메서드 입니다.");
	}
}
