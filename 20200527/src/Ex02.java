
public class Ex02 {
	Ex02(){
		Integer n1 = new Integer(10);
		Integer n2 = new Integer("3");
		
		System.out.println("최대값 : "+Integer.max(n1,n2));
		System.out.println("최솟값 : "+Integer.min(n1,n2));
		System.out.println("합계 : "+Integer.sum(n1,n2));
		
		System.out.println();
		
		System.out.println(n1+"의 2진수 = "+Integer.toBinaryString(n1));
		System.out.println(n1+"의 8진수 = "+Integer.toOctalString(n1));
		System.out.println(n1+"의 16진수 = "+Integer.toHexString(n1));
		
		System.out.println();
		
		System.out.println("형변환해서 숫자로 넣기");
		int a = Integer.parseInt("5");
		int b = Integer.valueOf("4");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
