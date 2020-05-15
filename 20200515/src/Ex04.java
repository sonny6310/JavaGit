class Person{
	protected String name;
	public Person(String name) {
		this.name = name;
	}
}
class StuFriend extends Person{
	public void doStudy() {
		System.out.println(name+"는 공부를 함");
	}
	public StuFriend(String name) {
		super(name);
	}
	
}
class ComFriend extends Person{
	public void doWork() {
		System.out.println(name+"는 일을 함");
	}
	public ComFriend(String name) {
		super(name);
	}
	
}
public class Ex04 {
	Ex04(){
//		StuFriend[] stufs = new StuFriend[10];
//		ComFriend[] comfs = new ComFriend[10];
//		
//		stufs[0] = new StuFriend("김");
//		comfs[0] = new ComFriend("김");
		
		
		// 자식클래스는 부모클래스 형태에 담을 수 있다.
		Person[] persons = new Person[20];
		persons[0] = new StuFriend("김");
		persons[1] = new ComFriend("나");
		// 하지만 persons.doStudy() 또는 persons.doWork()는 사용할 수 없다.
		// 따라서 ↓
		
		// if(A instanceof B) : 참조변수 A가 참조하는 인스턴스가 클래스 B의 인스턴스이거나 B를 상속하는 클래스의 인스턴스이면 true를, 아니면 false를 반환한다
		if (persons[0] instanceof StuFriend) { 
			StuFriend temp = (StuFriend)persons[0];
			temp.doStudy();
		}
		if (persons[1] instanceof ComFriend) {
			ComFriend temp = (ComFriend)persons[1];
			temp.doWork();
		}
		
		}
	public static void main(String[] args) {
		new Ex04();
	}
}
