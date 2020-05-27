import java.util.Arrays;

class PersonQz2 implements Comparable{
	int age;
	String name;
	public PersonQz2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		PersonQz2 p = (PersonQz2) o;
		return this.name.length() - p.name.length();
	}
}

public class Qz3 {
	Qz3(){
		PersonQz2[] psq2 = new PersonQz2[3];
		psq2[0] = new PersonQz2(55,"나다");
		psq2[1] = new PersonQz2(10,"가");
		psq2[2] = new PersonQz2(20,"라마바");
		
		Arrays.sort(psq2); // Comparable을 상속받고, 부모클래스의 CompareTo메서드를 오버라이딩하여 age기준으로 오름차순정렬하도록 재정의하였음
		for (int i = 0; i < psq2.length; i++) {
			System.out.println("psq2["+i+"].age = "+psq2[i].age);
			System.out.println("psq2["+i+"].name = "+psq2[i].name);
		}
	}
	
	public static void main(String[] args) {
		new Qz3();
	}
}
