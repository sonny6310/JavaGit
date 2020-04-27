
public class Ex04 {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		ba1.chkMyBal();
		ba1.depositMyBal(5000);
		ba1.chkMyBal();
		
		System.out.println();
		
		BankAccount ba2 = new BankAccount();
		ba2.chkMyBal();
		ba2.withdraw(3000);
		ba2.chkMyBal();
	}
}