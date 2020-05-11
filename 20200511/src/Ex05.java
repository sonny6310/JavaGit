import java.io.File;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		try {
			File file=new File("src/a.txt");
			Scanner sc=new Scanner(file);
			int a=sc.nextInt();
			System.out.println("a="+a);
			
			int b=sc.nextInt();
			System.out.println("b="+b);
			
			int c=sc.nextInt();
			System.out.println("c="+c);
			
			int d=sc.nextInt();
			System.out.println("d="+d);
			
			String str1=sc.next();
			System.out.println("str1="+str1);
			
			String str2=sc.next();
			System.out.println("str2="+str2);
			
			System.out.print("\n더할 값 세 개 입력:");
			Scanner sc2=new Scanner(System.in);
			int num1=sc2.nextInt();
			int num2=sc2.nextInt();
			int num3=sc2.nextInt();
			int sum=num1+num2+num3;
			System.out.println("입력값의 합은 "+sum);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}