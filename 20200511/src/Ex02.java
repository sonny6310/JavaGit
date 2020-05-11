
public class Ex02 {

	public static void main(String[] args) {
		String str1="Simple String";
		String str2="Simple String";
		if(str1.contentEquals(str2)==true) {
			System.out.println("str1과 str2는 같다");
		}else
			System.out.println("str1과 str2는 다르다");
		if(str1==str2) {
			System.out.println("str1과 str2는 같은 메모리주소(인스턴스)를 참조한다");
		}else
			System.out.println("str1과 str2는 다른 메모리주소(인스턴스)를 참조한다");
		
		System.out.println();
		
		String str3=new String("Simple String");
		String str4=new String("Simple String");
		if(str3.contentEquals(str4)==true) {
			System.out.println("str3과 str4는 같다");
		}else
			System.out.println("str3과 str4는 다르다");
		if(str3==str4) {
			System.out.println("str3과 str4는 같은 메모리주소(인스턴스)를 참조한다");
		}else
			System.out.println("str3과 str4는 다른 메모리주소(인스턴스)를 참조한다");
	}

}
