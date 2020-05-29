class Apple{

	@Override
	public String toString() {
		return "Apple";
	}
}
class Orange{

	@Override
	public String toString() {
		return "Orange";
	}
}
class AppleBox{
	Apple apple;

	public AppleBox(Apple apple) {
		super();
		this.apple = apple;
	}

	@Override
	public String toString() {
		return "AppleBox [" + apple + "]";
	}
	
}
class OrangeBox{
	Orange orange;

	public OrangeBox(Orange orange) {
		super();
		this.orange = orange;
	}

	@Override
	public String toString() {
		return "OrangeBox [" + orange + "]";
	}
}
public class Ex01 {
	public static void main(String[] args) {
		AppleBox ab = new AppleBox(new Apple());
		System.out.println(ab);
		OrangeBox ob = new OrangeBox(new Orange());
		System.out.println(ob);
	}
}
