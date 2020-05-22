class LSPhone implements newPhone{
	@Override
	public void recv() {
		System.out.println("수신가능");
	}
	
	@Override
	public void send() {
		System.out.println("발신가능");
	}
}
public class Ex05 {
	Ex05(){
		LPhone lp = new LPhone();
		lp.recv();
		
		new SPhone().recv();
		
		newPhone.internet();
		LSPhone lsp = new LSPhone();
		lsp.recv();
		lsp.send();
		lsp.kakao();
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
