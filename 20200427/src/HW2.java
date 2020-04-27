
public class HW2 {
	public static void main(String[] args) {
		Csize(5);
		Cline(7);
		System.out.println();
		
		Prime1(6);
		System.out.println();

		System.out.println("1이상 100이하 소수 출력");
		for(int i=1; i<101; i++) {
			Prime2(i);
		}
	}
	
	public static void Csize(int r) {
		double size=(double)r*r*3.14;
		System.out.println("반지름이 "+r+"일 때 원 넓이는 "+size);
	}
	public static void Cline(int r) {
		double size=(double)r*2*3.14;
		System.out.println("반지름이 "+r+"일 때 원 둘레는 "+size);
	}
	
	public static void Prime1(int k) {
		if(k<4 && k>0) {
			System.out.println(k+"는 소수");
		}else if(k>3 && k%2!=0 && k%3!=0) {
			System.out.println(k+"는 소수");
		}else {
			System.out.println(k+"는 소수가 아니다");
		}
	}
	
	public static void Prime2(int k) {
		if(k<4 && k>0) {
			System.out.println(k);
		}else if(k>3 && k%2!=0 && k%3!=0) {
			System.out.println(k);
		}
	}
}