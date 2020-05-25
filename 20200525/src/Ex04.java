import java.util.Scanner;

class MyException extends Exception{
	public MyException() {
		super("안돼 고기먹어");
	}
}
public class Ex04 {
	public static void main(String[] args) throws MyException {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("점심 뭐 먹을래?");
			String menu = scan.nextLine();
			if(menu.contains("고기")) {
				System.out.println("굿");
			}else {
				throw new MyException();
			}
		}catch(MyException e) {
			System.out.println("안돼 고기먹어");
		}
		
		System.out.println("-------------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점심 뭐 먹을래?");
		String menu = scan.nextLine();
		if(menu.contains("고기")) {
			System.out.println("좋아");
		}else {
			throw new MyException();
		}
	}
}
