import java.util.Arrays;

class PersonQz implements Comparable{
	int age;
	String name;
	public PersonQz(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		PersonQz p = (PersonQz) o;
		return p.age - this.age;
	}
}

public class Qz2 {
	Qz2(){
		PersonQz[] psq = new PersonQz[3];
		psq[0] = new PersonQz(55,"나");
		psq[1] = new PersonQz(10,"김");
		psq[2] = new PersonQz(20,"박");
		
		Arrays.sort(psq); // Comparable을 상속받고, 부모클래스의 CompareTo메서드를 오버라이딩하여 age기준으로 오름차순정렬하도록 재정의하였음
		for (int i = 0; i < psq.length; i++) {
			System.out.println("psq["+i+"].age = "+psq[i].age);
			System.out.println("psq["+i+"].name = "+psq[i].name);
		}
	}
	
	public static void main(String[] args) {
		new Qz2();
	}
}