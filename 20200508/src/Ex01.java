// 데이터영역: static변수들이 있고, 프로그램 시작에서 종료까지 존재하는 변수
// 스택영역: 지역변수. 함수 시작시에 선언하고나서 함수 종료시에 자동으로 날아가는 변수
// 힙영역: new객체를 통해서 선언하면 메모리상에 올라가고 jvm이 자동으로 메모리상에서 날린다

class StaticVariable{
	public static int a=0;
	public int b=10;
	StaticVariable(){
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println();
		a++;
		b++;
	}
}
public class Ex01 {
	Ex01(){
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();
		System.out.println("StaticVariable.a="+StaticVariable.a);
		System.out.println("StaticVariable.a="+StaticVariable.a);
//		System.out.println("StaticVariable.b="+StaticVariable.b);
//		b는 함수의 시작 시에 선언되므로, 위와 같이 클래스 내 변수를 바로 출력할 수 없다.(선언되지 않았으므로)
	}
	public static void main(String[] args) {
		new Ex01();
//		a는 프로그램 시작과 끝까지 계속 존재.
//		b는 StaticVariable가 시작 될 때 선언되고 끝나면 날아가버리므로 
//		sv1: b=10이므로 10이 출력된 후에 b++로 11이 되었지만 함수가 끝나서 날아가버림.
//		sv2: 다시 b=10으로 선언되고 마찬가지.
	}
}
