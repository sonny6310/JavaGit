class AA{
	String a="abcd";
	
	public String returnA() {
		return a;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		String a=new AA().returnA().concat("cc"); 
		// concat : 문자열 연결
		System.out.println("a="+a);
	}

}
