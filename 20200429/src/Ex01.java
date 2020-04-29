import java.util.Scanner;

class ToBinary{
	public String doBinary(int Decimal) {
		if(Decimal==0 || Decimal==1) {
			return Decimal+"";
		}else {
			return doBinary(Decimal/2)+Decimal%2;
		}
	}
}
public class Ex01 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("2진수로 바꾸고싶은 수 입력: ");
			int a=scan.nextInt();
			ToBinary tb = new ToBinary();
			String bin = tb.doBinary(a);
			System.out.println("10진수 "+a+"는 2진수로 "+bin+"입니다.");
		}
	}
}
