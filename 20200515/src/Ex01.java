class A{
	public void doA() {
		System.out.println("A.a");
	}
}
class B extends A{
	@Override
	public void doA() {
		System.out.println("B.doA");  // A클래스를 상속받았으나(doA함수를 상속받음) B클래스에도 같은 doA함수가 있어서 재정의(override)되어서 "B.doA"만 출력된다.
		// super : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수. 
		// A클래스의 doA를 출력하고싶다면
		super.doA();   
	}
}
public class Ex01 {
	Ex01(){
		B b = new B();
		b.doA();
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
