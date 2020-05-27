import java.util.Arrays;

class INum{
	private int num;
	public INum(int num){
		this.num = num;
	}
}

public class Ex07 {
	Ex07(){
		int[] a = {1,2,3,4,5};
		int[] b = {0,0,0,0,0,0,0,0};
		
		System.arraycopy(a, 1, b, 2, 3); // 배열 a의 인덱스 1에서 배열 b의 인덱스 2로 3개의 요소 복사
		for (int i : b) {
			System.out.println("i = "+i);
		}
		
		int[] c = {10,11,12,13};
		int[] d = c;
		int[] e = Arrays.copyOf(c, c.length);
		// arrays.equals는 배열의 내용을 비교
		System.out.println("c,d 배열 같음? "+Arrays.equals(c, d));
		System.out.println("c,e 배열 같음? "+Arrays.equals(c, e));
		// c.equals(e)는 c==e와 같음. 두 배열이 같은 객체인지 비교하는 것
		System.out.println("c,e 배열 같음? "+c.equals(e));  
		// == 는 주소값을 비교하기때문에 c와 e는 다르다고 나옴
		System.out.println("c,e 배열 같음? "+(c==e));
		
		
		INum[] ar1 = new INum[3]; 
		INum[] ar2 = new INum[3];
		ar1[0] = new INum(1);	ar2[0] = new INum(1);
		ar1[1] = new INum(2);	ar2[1] = new INum(2);
		ar1[2] = new INum(3);	ar2[2] = new INum(3);
		System.out.println("ar1,ar2 배열 같음? "+Arrays.equals(ar1, ar2));
		// 내용이 같을거라 생각하지만 다르기 때문에 false
		System.out.print("ar1 배열 : ");
		for (INum iNum : ar1) {
			System.out.print(iNum+ " ");
		}
		System.out.print("\nar2 배열 : ");
		for (INum iNum : ar2) {
			System.out.print(iNum+ " ");
		}
	}
	
	public static void main(String[] args) {
		new Ex07();
	}
}