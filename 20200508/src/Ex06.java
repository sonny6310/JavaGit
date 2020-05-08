
public class Ex06 {
	int a=10;
	int b=20;
	
	Ex06(){
		System.out.println("기본생성자");
	}
	Ex06(int aa){
		this();
		System.out.println("파라미터 한 개 있는 생성자");
		a=aa;
	}
	Ex06(int aa,int bb){
		this(aa);
		System.out.println("파라미터 두 개 있는 생성자");
		b=bb;
	}
	public void doPrint() {
		System.out.println("a="+a+", b="+b+"\n");
	}
	public static void main(String[] args) {
		Ex06 ex1=new Ex06();
		ex1.doPrint();
		Ex06 ex2=new Ex06(11);
		ex2.doPrint();
		Ex06 ex3=new Ex06(12,22);
		ex3.doPrint();
	}
}
