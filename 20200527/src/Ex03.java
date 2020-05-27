import java.math.BigDecimal;

class MyWrapA{
	int a=10;
	public MyWrapA(int a) {
		super();
		this.a = a;
	}
	public int doAdd(int b) {
		return this.a+b;
	}
	public void _doAdd(int b) {
		this.a = this.a+b;
	}
}

public class Ex03 {
	Ex03(){
		double a = 0.1;
		for(int i=0; i<10; i++) {
			a+=0.1;
		}
		System.out.println("a = "+a);
		
		BigDecimal bd = new BigDecimal(0.1);
		for(int i=0; i<10; i++) {
			bd = bd.add(new BigDecimal(0.1));
		}
		System.out.println("bd = "+bd);
		
		System.out.println();
		
		MyWrapA mwa = new MyWrapA(10);
		System.out.println(mwa.a);
		mwa.a = mwa.doAdd(10);
		System.out.println(mwa.a);
		mwa._doAdd(5);
		System.out.println(mwa.a);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
