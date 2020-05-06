
public class A {
	public static void main(String[] args) {
		B b = new B();    // 같은 패키지 내에 있으므로 패키지경로( ex:--.--.B ) 안써도 됨
		b.doA();
	}
}