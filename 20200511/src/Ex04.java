class Box{
	String name;
	//alt+shift+s + o : 생성자 자동완성
	public Box(String name) {
		super();
		this.name = name;
	}
	
	//alt+shift+s + s : toString() 메서드 자동완성
	@Override
	public String toString() {
		return "Box [name=" + name + "]";
	}
	
}
public class Ex04 {

	public static void main(String[] args) {
		Box box1=new Box("사과박스");
		System.out.println(box1);
		System.out.println(box1.toString());
		
		System.out.println();
		
		Box box2=new Box("레몬박스");
		System.out.println(box2);
		System.out.println(box2.toString());
	}

}
