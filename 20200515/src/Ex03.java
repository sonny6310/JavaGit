class AAA{
	public void doA() {
		System.out.println("AAA.doA");
	}
}
class BBB extends AAA{
	public void doB() {
		System.out.println("BBB.doB");
	}
}
class CCC extends BBB{
	public void doC() {
		System.out.println("CCC.doC");
	}
}
//new CCC 생성하면 doA doB doC 함수 호출 가능
//new BBB 생성하면 doA doB 함수 호출 가능
//new AAA 생성하면 doA 함수 호출 가능
//
//모든 자식 클래스는 부모 클래스 형태에 담을 수 있다
//부모클래스 형태를 기반으로 호출할 수 있는 함수가 정해진다
//
//부모클래스는 자식 클래스에 형태를 담을 수 없다(형변환을 통해서 담아야 함)
public class Ex03 {
	Ex03(){
		CCC ccc = new CCC();
		ccc.doA();
		ccc.doB();
		ccc.doC();
		
		
		AAA a1 = new AAA();
		AAA a2 = new BBB();
		AAA a3 = new CCC();
		// 자식클래스는 부모클래스 형태에 담을 수 있다.  ※.doA 만 호출이 가능하다
		
		// CCC c1 = new AAA();  // 부모클래스는 자식클래스 형태에 담을 수 없다.
		
		// 강제 형변환을 통해서 담을 수 있음.
		// 실행하면 담을 수 없다고 터미널에서 오류가 날 수 있다.
//		CCC c1 = (CCC) new AAA();  
//		c1.doA();
//		c1.doB();
//		c1.doC();
		
		try {			
			AAA a4 = new AAA();
			if( a4 instanceof CCC) {
				System.out.println("바꿀 수 있다");
			}else {
				System.out.println("바꿀 수 없다");
			}
		}catch (Exception e){
			
		}

	}
	public static void main(String[] args) {
		new Ex03();
	}
}
