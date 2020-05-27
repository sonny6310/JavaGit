import java.util.Arrays;

class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
}
class Person2 implements Comparable{
	int age;
	String name;
	public Person2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
//		Person2 p = (Person2) o;
//		if(this.age > p.age) {
//			return 1;
//		}else if(this.age < p.age) {
//			return -1;
//		}else {
//			return 0;			
//		}
		Person2 p = (Person2) o;
		return this.age - p.age;
	}
}

public class Ex08 {
	Ex08(){
//		Person[] ps = new Person[3];
//		ps[0] = new Person(10,"김");
//		ps[1] = new Person(20,"나");
//		ps[2] = new Person(55,"박");
//		
//		Arrays.sort(ps); // 오류. 어떤걸(int인지 String인지) 기준으로 오름차순으로 정렬해야할지 모름
//		for (int i = 0; i < ps.length; i++) {
//			System.out.println("ar["+i+"].age = "+ps[i].age);
//			System.out.println("ar["+i+"].name = "+ps[i].name);
//		}
		
		Person2[] ps2 = new Person2[3];
		ps2[0] = new Person2(55,"나");
		ps2[1] = new Person2(10,"김");
		ps2[2] = new Person2(20,"박");
		
		Arrays.sort(ps2); // Comparable을 상속받고, 부모클래스의 CompareTo메서드를 오버라이딩하여 age기준으로 오름차순정렬하도록 재정의하였음
		for (int i = 0; i < ps2.length; i++) {
			System.out.println("ps2["+i+"].age = "+ps2[i].age);
			System.out.println("ps2["+i+"].name = "+ps2[i].name);
		}
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
}
