// 제네릭

class Apple__{

	@Override
	public String toString() {
		return "Apple";
	}
}
class Orange__{

	@Override
	public String toString() {
		return "Orange";
	}
}
class FruitBox_<T>{
	T object;
	public FruitBox_(T obj) {
		super();
		this.object = obj;
	}
	@Override
	public String toString() {
		return "FruitBox [" + object + "]";
	}
}
public class Ex03 {
	public static void main(String[] args) {
		FruitBox_<Apple__> fb1 = new FruitBox_<Apple__>(new Apple__());
		System.out.println(fb1);
		FruitBox_<Orange__> fb2 = new FruitBox_<Orange__>(new Orange__());
		System.out.println(fb2);
		
//		오류 : <Apple__>이라 하고 new Orange를 해서. (Apple에는 Apple만 담기도록 되어있음)
//		FruitBox_<Apple__> fb3 = new FruitBox_<Apple__>(new Orange__());
//		System.out.println((fb3));
		
	}
}