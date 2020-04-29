class AAA{
	
}

public class Ex03 {
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();  // 오류 아닌이유: 디폴트생성자 public Ex03(){} 가 자동생성됨
		AAA aaa = new AAA();   // 마찬가지로 public AAA(){} 자동생성되어있음
	}
}