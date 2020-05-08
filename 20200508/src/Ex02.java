
public class Ex02 {
	Ex02(){
		AccessWay aw=new AccessWay();
		aw.a++;
		AccessWay.a++;
		System.out.println("a="+AccessWay.a);
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
