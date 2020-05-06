import Pr.PrA;

public class CiA extends PrA {    // PrA 를 상속
	CiA(){
		num1=20;  // public: 어디서든 가능
		num2=25;  // protected: 클래스내부,동일패키지,상속 가능
//		num3=30;  // 컴파일 오류!   defalut: 상속받을 수 없음. 클래스내부, 동일패키지에서만
//		num4=35;  // 컴파일 오류!   private: 클래스내부에서만
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
//		System.out.println("num3 = "+num3);
//		System.out.println("num4 = "+num4);
	}
	public static void main(String[] args) {
		new CiA();
	}
}
