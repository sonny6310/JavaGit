import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	Ex06(){
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 수 입력: ");
			int a = scan.nextInt();
			
			System.out.print("두번째 수 입력: ");
			int b = scan.nextInt();
			
			System.out.println("두 수의 몫은 "+a/b);			
			scan.close(); // 연결 스크림 끊기 읽기 속성 취소
		}catch (ArithmeticException ae) {  // ArithmeticException : 수학 연산에서의 오류상황을 의미하는 예외 클래스
			System.out.println("예외상황 ex)분모에 0 입력");
//			ae.printStackTrace(); // 예외상황 발생 추적
		}catch (InputMismatchException ie) { // InputMismatchException : 클래스 Scanner를 통한 값의 입력에서의 오류 상황을 의미하는 예외 클래스
			System.out.println("예외상황 ex)문자 입력");
		}
		System.out.println("종료됩니다.");
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}
