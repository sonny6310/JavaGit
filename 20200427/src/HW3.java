
public class HW3 {
	public static void main(String[] args) {
		System.out.println("2의 0승은 "+square(0));
		System.out.println("2의 1승은 "+square(1));
		System.out.println("2의 2승은 "+square(2));
		System.out.println("2의 3승은 "+square(3));
		System.out.println("2의 4승은 "+square(4));
		System.out.println("2의 5승은 "+square(5));
		System.out.println("2의 6승은 "+square(6));
		
		System.out.println();
		
		Binary(10);		
	}
	
	public static int square(int n) {
		if(n==0) {
			return 1;
		}else {
			return 2*square(n-1);
		}
	}
		
	public static void Binary(int k) {
		if(k<2) {
			System.out.print(k);
			return;
		}else {
			Binary(k/2);
			System.out.print(k%2);
		}
	}
}