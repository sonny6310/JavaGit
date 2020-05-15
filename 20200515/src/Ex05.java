class AA{
	public void doSome() {
		System.out.println("aa");
	}
}
class BB extends AA{
	public void doSome() {
		System.out.println("bb");
	}
}
class CC extends BB{
	public void doSome() {
		System.out.println("cc");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		CC cc = new CC();
		cc.doSome();
		
		BB bb = new BB();
		bb.doSome();
		
		AA aa = new AA();
		aa.doSome();
	}
}
