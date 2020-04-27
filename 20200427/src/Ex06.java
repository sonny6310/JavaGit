import java.util.Scanner;

class Human{
	int hp=100;
	void doAtt(Monster mon) {
		mon.hp=mon.hp-3;
		System.out.println("몬스터 hp = "+mon.hp);
	}
}

class Monster{
	int hp=100;
	void doAtt(Human hum) {
		hum.hp=hum.hp-4;
		System.out.println("사람 hp = "+hum.hp);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Human h1=new Human();
		Monster m1=new Monster();
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("1: 사람→몬스터 공격. 2: 몬스터→사람 공격. 3: 종료\n선택하시오 :: ");
			int select=scan.nextInt();
			if(select==1) {
				h1.doAtt(m1);
			}else if(select==2) {
				m1.doAtt(h1);
			}else {
				System.out.println("종료됩니다.");
				System.exit(1);
			}
		}
	}
}
