
public class Ex03 {
	public static void main(String[] args) {
		try {
			doA();
		}catch(Exception e) {
//			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}
	public static void doA() throws Exception{
		doB();
	}
	public static void doB() throws Exception{
		// RuntimeException 실행하는 중간에 발생하는 예외
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);			
		}catch(ArithmeticException e) {
//			e.printStackTrace();
		}
		
		// 소스 상에 Exception 빨간 줄이 나오기 때문에 예외를 무조건 잡아줘야 한다.
		throw new Exception("내가 만든 예외");
	}
}
