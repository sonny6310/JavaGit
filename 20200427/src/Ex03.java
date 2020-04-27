import java.util.Scanner;

class AccountBank{
	int myBal=200000;
	
	public void deposit(int inputValue) {
		myBal += inputValue;
	}
	public void exit(int input) {
		myBal -= input;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입금하려면 1, 출금하려면 2 를 입력하세요.");
		int select = scan.nextInt();
		
		AccountBank ab1 = new AccountBank(); 
		
		if(select==1) {
			System.out.print("입금하실 금액 입력: ");
			int push = scan.nextInt();
			ab1.deposit(push);
			System.out.println();
			System.out.println("입금 완료.");
			System.out.println("내 잔액 = "+ab1.myBal);
		}else if(select==2) {
			System.out.println("현재 잔액: "+ab1.myBal);
			System.out.print("출금하실 금액 입력: ");
			int push = scan.nextInt();
			ab1.exit(push);
			System.out.println();
			System.out.println("출금 완료.");
			System.out.println("내 잔액 = "+ab1.myBal);
		}
	}
}
