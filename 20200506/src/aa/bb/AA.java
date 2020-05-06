package aa.bb;

public class AA {
	AA(){
		System.out.println("기본생성자 덮어쓰기");
	}
	public static void main(String[] args) {
		cc.dd.AA aa = new cc.dd.AA();
		aa.doA();
		
		AA aa2 = new AA();
	}
}
