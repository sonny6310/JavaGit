class _Box<T>{
	T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "_Box [t=" + t + "]";
	}
	
}
public class Ex07 {
	// 제네릭메소드
	
//	public static <T extends Number> _Box<T> makeBox(T o){ // 이러면 T에는 String 들어갈 수 없음.
	public static <T> _Box<T> makeBox(T o){ // 정의
		_Box<T> box = new _Box<T>(); // 상자 생성
		box.set(o); // 전달된 인스턴스를 상자에 담아서
		return box; // 상자 반환
	}
	public static void main(String[] args) {
		_Box<String> sbox = makeBox("Sweet");
		System.out.println(sbox);
		System.out.println(sbox.get());
	}
}

