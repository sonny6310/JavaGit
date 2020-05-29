class Box<T>{
	T t;

	public Box(T t) {
		super();
		this.t = t;
	}

	@Override
	public String toString() {
		return "Box [t=" + t + "]";
	}
}
public class Ex06 {
	Ex06(){
		Box<Integer> box1 = new Box<>(11);
		System.out.println("box1 = "+box1);
		Box<String> box2 = new Box<>("스트링");
		System.out.println("box2 = "+box2);
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
