
public interface Phone {
	public void recv();
//	public void send();
}

interface newPhone extends Phone{
	public void send();
	default public void kakao() {
		System.out.println("카톡");
	};
	static public void internet() {
		System.out.println("인터넷");
	};
}
