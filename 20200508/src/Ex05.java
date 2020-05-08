
public class Ex05 {
	int a=10;
	int b=20;
	Ex05(){
		
	}
	Ex05(int aa){
		a=aa;
	}
	Ex05(int aa,int bb){
		a=aa;
		b=bb;
	}
	public void doPrint() {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println();
	}
	public static void main(String[] args) {
		Ex05 ex1=new Ex05();
		ex1.doPrint();
		Ex05 ex2=new Ex05(11);
		ex2.doPrint();
		Ex05 ex3=new Ex05(12,22);
		ex3.doPrint();
	}
}
