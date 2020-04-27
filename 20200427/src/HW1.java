
public class HW1 {
	public static void Cal(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" x "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
	}
	public static void AbsMinus(int a, int b) {
		if(a<b) {
			System.out.println(a+" - "+b+"의 절대값은 "+(b-a));
		}else {
			System.out.println(a+" - "+b+"의 절대값은 "+(a-b));
		}
	}

	public static void main(String[] args) {
		Cal(12,15);
		AbsMinus(31,53);
		AbsMinus(53,31);
	}
}
