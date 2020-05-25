import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = null;
		int output = 0;

		try {
			scan = new Scanner(new File("d://2020java//20200525//a.txt"));  
			String temp = null;
			while ((temp = scan.next()) != null) {
				System.out.println("a = " + temp);

				try {
					int changeTemp = Integer.parseInt(temp);
					output += changeTemp;
				} catch (Exception e) {
//					System.out.println("ccc,ddd,eee는 int형으로 형변환 불가");
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 a.txt파일이 없습니다.");
//			e.printStackTrace();
		} catch (Exception e) {
//			e.printStackTrace();
		}

		System.out.println("숫자 합은 " + output);
		System.out.println("정상종료");

		scan.close();
	}
}
