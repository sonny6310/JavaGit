class StaticMethod{
	public static void doA() {
		int a=0;
		System.out.println("static method입니다.");
		System.out.println("a="+a);
	}
//	static int a=0;
//	public static void doA() {
//		System.out.println("static method입니다.");
//		System.out.println("a="+a);
//	}
}
public class Ex03 {
	public static void main(String[] args) {
		StaticMethod sm=new StaticMethod();
		sm.doA();
		StaticMethod.doA();
	}
}
