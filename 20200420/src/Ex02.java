import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		try (Scanner integer = new Scanner(System.in)) {
			System.out.print("n1 입력: ");
			int n1 = integer.nextInt();
			System.out.print("n2 입력: ");
			int n2 = integer.nextInt();
			
			if(n1==n2) {
				System.out.println("\nn1과 n2는 같다.");
			}
			if(n1<n2) {
				System.out.println("\nn2가 n1보다 더 크다");
			}
			if(n1>n2) {
				System.out.println("\nn1이 n2보다 더 크다");
			}
		}
	}
}