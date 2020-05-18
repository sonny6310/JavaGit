class Cake{
	// Object클래스의 toString메소드를 overriding
	public String toString() {
		System.out.println(super.toString()); // Object클래스의 toString메소드 호출하여 반환 결과 출력
		return "My birthday cake";
	}
}
class CheeseCake extends Cake{
	// Cake클래스의 toString메소드를 overriding
	@Override
	public String toString() {
		return "My birthday cheese cake";
	}
}
class OverridingToString {
	public static void main(String[] args) {
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake(); // 다형성
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
