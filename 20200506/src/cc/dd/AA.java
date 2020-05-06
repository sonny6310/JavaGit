package cc.dd;

public class AA {
	// 다른 패키지에 있으므로 같은 java파일명이 생성가능하다.
	public AA(){	// public 안쓰면 aa.bb.AA 에서 여기 클래스 AA클래스 불러올 때 error!
					// public : 어디서든 접근가능. default : 동일 패키지로 묶인 클래스 내에서만 접근가능
		System.out.println("cc.dd.AA클래스의 기본생성자");
	}
	public void doA() {
		System.out.println("cc.dd.AA.doA메서드 입니다.");
	}
}
