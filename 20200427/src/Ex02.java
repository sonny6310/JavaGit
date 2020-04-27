class AAA {
	int a = 10;
	int b = 20;

	public void doA() {
		System.out.println("A클래스 doA 입니다.");
	}

	public void doB() {
		System.out.println("A클래스 doB 입니다.");
	}
}

public class Ex02 {
	
	public static void doB(int ar) {
		System.out.println("doB 입니다.");
		System.out.println("doB_ar = " + ar);
	}

	public static void main(String[] args) {
		doA();
		doB(33);
		doB(2);
		doB(4);
		System.out.println();
		AAA T=new AAA();
		T.doA();
		T.doB();
		System.out.println("T.a = "+T.a);
		System.out.println("T.b = "+T.b);
	}

	public static void doA() {
		System.out.println("doA 입니다.");
	}

}
