import aa.bb.Myinterface;

//class MyConstant{
//	public static final String DBUrl = "192.168.0.198";
//	public static final String DBUser = "hr";
//	public static final String DBPass = "1234";
//}
interface MyVari{
	String DBUrl = "192.168.0.198";
	String DBUser = "hr";
	String DBPass = "1234";
}

public class Ex04 {
	Ex04(){
		System.out.println(Myinterface.AA);
		System.out.println(Myinterface.BB);
//		Myinterface.AA = 30; // public static final 이므로 값을 변경할 수 없다.
		
		Myinterface mf = new Myinterface() {
			@Override
			public void doMyinterface() {
				System.out.println("테스트");
			}
		};
		
		mf.doMyinterface();
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
	
}
