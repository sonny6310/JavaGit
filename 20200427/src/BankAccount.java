//잔액 myBal
//계좌확인 ChkMyBal
//계좌입금 depositMyBal
//계좌출금 withdraw

public class BankAccount {
	int myBal;

	public void chkMyBal() {
		System.out.println("잔액 : " + myBal);
	}

	public void depositMyBal(int in) {
		myBal += in;
		System.out.println(in + "원 입금했습니다.");
	}

	public void withdraw(int out) {
		if(myBal<out) {
			System.out.println("잔액이 부족합니다.\n출금에 실패했습니다.");
			return;
		}
		myBal -= out;
		System.out.println(out + "원 출금했습니다.");
	}
}