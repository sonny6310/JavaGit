import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int[] a=new int[10];
		Arrays.fill(a, 3);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] ="+a[i]);
		}
		
		System.out.println();
		
		int[] b=new int[10];
		Arrays.fill(b,0,2,3);    // b배열을 0으로 채우는데 처음 2개는 3으로 채워라
		for (int i = 0; i < a.length; i++) {
			System.out.println("b["+i+"] ="+b[i]);
		}
	}
}
