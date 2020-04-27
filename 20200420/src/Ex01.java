import java.util.Scanner;
/*
 * debug 이클립스에서 사용하는 개발자 개발도구
 * f11 : 디버그모드 실행
 * f6 : 라인진행
 * f8 : 디버그모드 종료 or 다음 브레이크 포인트까지 진행
 */
public class Ex01 {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.print("입력하세요: ");
		try (Scanner scan = new Scanner(System.in)) {
			String inputValue = scan.nextLine();
			System.out.println("inputValue = "+inputValue);
		}
	}
}