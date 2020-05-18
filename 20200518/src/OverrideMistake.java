class ParentAdder{
	public int add(int a, int b) {
		return a+b;
	}
}
class ChildAdder extends ParentAdder{
	// 상위 클래스의 add를 오버라이딩 하려 함.
	@Override
	public double add(double a, double b) {     // 매개변수 형과 반환형이 상위클래스와 다르므로 오버라이딩이 아니다.
		System.out.println("덧셈을 진행합니다");
		return a+b;
	}
}
class OverrideMistake {
	public static void main(String[] args) {
		ParentAdder adder = new ChildAdder();
		System.out.println(adder.add(3, 4));
//		System.out.println(adder.add(3.6, 4.2));  // 오류
	}
}
