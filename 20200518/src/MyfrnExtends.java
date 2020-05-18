class Friend{
	protected String name;
	protected String phone;
	
	public Friend(String na, String ph) {
		name=na;
		phone=ph;
	}
	
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("번호: "+phone);
	}
}

class UnivFriend2 extends Friend{
	private String major;

	public UnivFriend2(String na, String ma, String ph) {
		super(na,ph);
		major=ma;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("전공: "+major);
	}
}

class CompFriend2 extends Friend{
	private String department;
	
	public CompFriend2(String na, String de, String ph) {
		super(na,ph);
		department=de;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("부서: "+department);
	}
}

class MyfrnExtends {
	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt=0;
		
		frns[cnt++] = new UnivFriend2("Oh", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend2("Park", "Electronics", "010-222-444");
		frns[cnt++] = new CompFriend2("Kim","R&D 1","02-123-999");
		frns[cnt++] = new CompFriend2("Choi","R&D 2","02-321-777");

//		for(int i=0; i<cnt; i++) {
//			frns[i].showInfo();
//			System.out.println();
//		}
		for(Friend fr : frns) {
			if(fr != null) {
				fr.showInfo();
				System.out.println();
			}
		}
	}
}