import java.util.ArrayList;

public class Ex04 {
	Ex04(){
		int[] a = new int[4];
		System.out.println("배열");
		for (int i : a) {
			System.out.println("i = "+i);
		}
		
		System.out.println();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(2);
		System.out.println("리스트");
		for (Integer integer : al) {
			System.out.println("integer = "+integer);
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
