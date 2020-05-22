
public class Ex03 {
	Ex03(){
		myInter mi = new myInter() {
			@Override
			public void doA() {
				System.out.println("mi 인터페이스");
			}
		};
		
		doUseMyInter(mi);
		
		doUseMyInter(new myInter() {
			@Override
			public void doA() {
				System.out.println("익명 인터페이스");
			}
		});
		
		doUseMyInter( ()->{ System.out.println("람다 인터페이스"); } );		
	}
	public void doUseMyInter(myInter mi) {
		mi.doA();
	}
	public static void main(String[] args) {
		new Ex03();	
	}
}
