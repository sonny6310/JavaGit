import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		final int MAX=10;
		final char CHAR='상';
		final int ASSIGNED;
		ASSIGNED=12;
		
		System.out.println("MAX = "+MAX);
		System.out.println("CHAR = "+CHAR);
		System.out.println("ASSIGNED = "+ASSIGNED);
//		ASSIGNED=25; (final : 상수이므로 한번 값 입력 후에 다른 값으로 갱신 불가)
//		System.out.println("ASSIGNED = "+ASSIGNED);
		Scanner scan = new Scanner(System.in);
		System.out.println("a값 입력: ");
		String a = scan.nextLine();
		System.out.println("a = "+a);
	}
}