interface Phone{
	public void call();
}
class SPhone implements Phone{
	@Override
	public void call() {
		System.out.println("삼성 전화기로 전화");
	}
}
class LPhone implements Phone{
	@Override
	public void call() {
		System.out.println("LG 전화기로 전화");
	}
}
public class PhoneMain {
	public static void main(String[] args) {
		Phone ph=new SPhone();
		ph.call();
		ph=new LPhone();
		ph.call();
	}
}
