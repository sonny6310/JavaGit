class UnivFriend{
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name=na;
		major=ma;
		phone=ph;
	}
	
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("전공: "+major);
		System.out.println("전화: "+phone);
	}
}

class CompFriend{
	private String name;
	private String department;
	private String phone;
	
	public CompFriend(String na, String de, String ph) {
		name=na;
		department=de;
		phone=ph;
	}
	
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("부서: "+department);
		System.out.println("전화: "+phone);
	}
}

class Myfriends {
	public static void main(String[] args) {
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt=0;
		CompFriend[] cfrns = new CompFriend[5];
		int ccnt=0;
		
		ufrns[ucnt++] = new UnivFriend("Lee", "Computer", "010-333-555");
		ufrns[ucnt++] = new UnivFriend("Seo", "Electronics", "010-222-444");
		
		cfrns[ccnt++] = new CompFriend("Yoon","R&D 1","02-123-999");
		cfrns[ccnt++] = new CompFriend("Park","R&D 2","02-321-777");
		
		
//		for(int i=0; i<ucnt; i++) {
//			ufrns[i].showInfo();
//			System.out.println();
//		}
		for(UnivFriend uni : ufrns) {
			if(uni != null) {
				uni.showInfo();
				System.out.println();
			}
		}
//		for(int i=0; i<ccnt; i++) {
//			cfrns[i].showInfo();
//			System.out.println();
//		}
		for(CompFriend com : cfrns) {
			if(com != null) {
				com.showInfo();
				System.out.println();
			}
		}
	}
}
