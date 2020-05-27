import java.util.Arrays;

public class Ex06 {
	Ex06(){
		int[] a = {1,2,3,4,5};
		int[] b = a;
		System.out.print("a배열 : ");
		for(int i : a) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		System.out.print("b배열 : ");
		for (int i : b) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		System.out.println("a[0]=10으로 변경");
		a[0]=10;
		System.out.print("a배열 : ");
		for (int i : a) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		System.out.print("b배열 : ");
		for (int i : b) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		System.out.print("c배열(a배열 복사) : ");
		int[] c = Arrays.copyOf(a, 4);
		for (int i : c) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		System.out.println("a[0]=55로 변경");
		a[0]=55;
		System.out.print("a배열 : ");
		for (int i : a) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		System.out.print("b배열 : ");
		for (int i : b) {
			System.out.print("i = "+i+" ");
		}
		System.out.println();
		System.out.print("c배열 : ");
		for (int i : c) {
			System.out.print("i = "+i+" ");
		}
		
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
