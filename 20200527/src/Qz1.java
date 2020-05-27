import java.util.Random;
import java.util.Scanner;

public class Qz1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("난수 최소값 입력: ");
		int A = scan.nextInt();
		System.out.print("난수 최대값 입력: ");
		int Z = scan.nextInt();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(A + rand.nextInt(Z-A+1));
		}
	}
}
