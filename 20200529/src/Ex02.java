class Apple_{

	@Override
	public String toString() {
		return "Apple";
	}
}
class Orange_{

	@Override
	public String toString() {
		return "Orange";
	}
}
//class AppleBox{
//	Apple apple;
//
//	public AppleBox(Apple apple) {
//		super();
//		this.apple = apple;
//	}
//
//	@Override
//	public String toString() {
//		return "AppleBox [" + apple + "]";
//	}
//	
//}
//class OrangeBox{
//	Orange orange;
//
//	public OrangeBox(Orange orange) {
//		super();
//		this.orange = orange;
//	}
//
//	@Override
//	public String toString() {
//		return "OrangeBox [" + orange + "]";
//	}
//}
class FruitBox{
	Object object;
	public FruitBox(Object obj) {
		super();
		this.object = obj;
	}
	@Override
	public String toString() {
		return "FruitBox [" + object + "]";
	}
}
public class Ex02 {
	public static void main(String[] args) {
		FruitBox fb1 = new FruitBox(new Apple_());
		System.out.println(fb1);
		FruitBox fb2 = new FruitBox(new Orange_());
		System.out.println(fb2);
	}
}