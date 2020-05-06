
public class RectMain {
	public static void main(String[] args) {
		Rect r1 = new Rect();
//		r1.width = 100;  // 컴파일 오류!
		r1.setWidth(100);
		System.out.println("Rect Width = "+r1.getWidth());
//		r1.height = 50  // 컴파일 오류!
		r1.setHeight(50);
		System.out.println("Rect Height = "+r1.getHeight());
	}
}