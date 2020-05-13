import java.util.Scanner;

public class Ex01 {
	private Student[] stus = new Student[4];
	int cnt=0;
	Scanner scan = new Scanner(System.in);
	Ex01(){
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1:학생입력  2:학생출력  3:종료");
			System.out.println("------------------------------");
			int select = scan.nextInt();
			if(select==1) {	
				if(cnt>=stus.length) {
					System.out.println("저장 범위 초과입니다.");
					System.out.println("출력 혹은 종료를 하십시오.\n");
					continue;
				}
				scan.nextLine(); // 입력버퍼 삭제
				System.out.print("이름입력: ");
				String name = scan.nextLine();
				System.out.print("나이입력: ");
				int age = scan.nextInt();
				stus[cnt]= new Student(name, age, (cnt+1));
				System.out.println("등록 완료.\n");
				cnt++;
			}else if(select==2) {
				for(Student s:stus) {
					System.out.println(s);
				}
				System.out.println();
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
