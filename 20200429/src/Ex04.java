class BBB{
	String name;
	
	public BBB(String n) {
		name = n;
	}
	public BBB() {
		
	}
}
public class Ex04 {
	public static void main(String[] args) {
		BBB bb1 = new BBB();    
		BBB bb2 = new BBB("ㅎㅇ");
		//BBB(변수) 변수 유무, 변수 종류가 다르면 같은 이름(BBB)이라도 선언가능
		// :: 오버로딩
	}
}
