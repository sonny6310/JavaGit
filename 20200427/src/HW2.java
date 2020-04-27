
public class HW2 {
	public static void main(String[] args) {
		Csize(5);
		Cline(7);
		System.out.println();
		
		Prime();
	}
	
	public static void Csize(int r) {
		double size=(double)r*r*3.14;
		System.out.println("반지름이 "+r+"일 때 원 넓이는 "+size);
	}
	public static void Cline(int r) {
		double size=(double)r*2*3.14;
		System.out.println("반지름이 "+r+"일 때 원 둘레는 "+size);
	}
	
	public static void Prime() {
		int m=0;
		int l=0;
		int[] prime=new int[100];
		for(int i=2; i<100; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					m++;
				}
			}
			if(m==0) {
				prime[l]=i;
				System.out.println(prime[l]);				
			}
			m=0;
		}
	}
}