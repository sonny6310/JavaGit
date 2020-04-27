class Person{
	String name="";
	void doStudy() {
		System.out.println(name+"은 공부중.");
	}
	void setName(String input) {
		name=input;
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Person ps1 = new Person();
		ps1.setName("홍길동");
		ps1.doStudy();
		
		Person ps2=ps1;               // ps2에 ps1값이 복사되는게 아니라 ps1과 같은 걸 참조하게 된다.
		ps2.setName("김길동");
		ps2.doStudy();
		
		ps1.doStudy();
	}
}
