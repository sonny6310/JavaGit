public class ex06 {
	public static void main(String[] args) {
		int a=3;
		int n=1;
		System.out.println(a+=(3*(++n)));
		System.out.println(a+=(3*(++n)));
		System.out.println(a+=(3*(++n)));
		
		System.out.println();
		
		int n1=((25+5)+(36/4)-72)*5;
		int n2=((25*5)+(36-4)+71)/4;
		int n3=(128/4)*2;
		
		boolean result=(n1 > n2) && (n2 > n3);
		System.out.println(result);
	}
}
