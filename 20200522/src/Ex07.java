import javax.swing.JOptionPane;

class A{
	private int a=10;
}
class B extends A{
	private int b=20;
}
public class Ex07 {
	Ex07(){
		try {
			int[] arr = {1, 2, 3};
			for (int i = 0; i < 4; i++) {
				System.out.println("arr["+i+"]= "+arr[i]); // IndexOutofBoundsException
			}
			
			A a = new A();
			B b = (B) a; // classcastException
			
			String c = null;
			System.out.println(c.length()); // NullPointerException
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 벗어남");
		}catch (ClassCastException e) {
			System.out.println("클래스 형변환 실패");
		}catch(NullPointerException e) {
			System.out.println("Null Point Exception");
		}catch (Exception e) {
			System.out.println("예상 못한 다른 예외 상황 발생");
			e.printStackTrace();
		}
		
		System.out.println();
		
		String test = JOptionPane.showInputDialog("입력하세요");
		System.out.println("test = "+test);
		int bb=0;
		try {
			if((bb = Integer.parseInt(test)) == 1) {
				System.out.println("1을 입력함");
			}
		}catch (Exception e) {
			System.out.println("int형 아닌 수 입력 또는 문자를 입력함");
		}
		
		System.out.println();
		System.out.println("정상 종료");
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
