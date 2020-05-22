interface myInter{
	public void doA();
}

public class Ex02 implements myInter {
	Ex02(){
		doA();
	}
	
	@Override
	public void doA() {
		System.out.println("인터페이스 호출");
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
