import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		final int MAX=10;
		final char CHAR='��';
		final int ASSIGNED;
		ASSIGNED=12;
		
		System.out.println("MAX = "+MAX);
		System.out.println("CHAR = "+CHAR);
		System.out.println("ASSIGNED = "+ASSIGNED);
//		ASSIGNED=25; (final : ����̹Ƿ� �ѹ� �� �Է� �Ŀ� �ٸ� ������ ���� �Ұ�)
//		System.out.println("ASSIGNED = "+ASSIGNED);
		Scanner scan = new Scanner(System.in);
		System.out.println("a�� �Է�: ");
		String a = scan.nextLine();
		System.out.println("a = "+a);
	}
}