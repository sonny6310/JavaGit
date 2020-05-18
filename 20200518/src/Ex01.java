interface A{
	public void doA();
}
interface B{
	public void doB();
}

public class Ex01 implements A,B{
	@Override
	public void doA() {
		System.out.println("doA 함수 입니다.");
	}
	@Override
	public void doB() {
		System.out.println("doB 함수 입니다.");
	}
	Ex01(){
		doA();
		doB();
	}
	public static void main(String[] args) {
		new Ex01();
		Ex01 ex01 = new Ex01();
		ex01.doA();
		ex01.doB();
	}
	
}
