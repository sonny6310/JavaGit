import java.util.StringTokenizer;

public class Ex05 {
	Ex05(){
		StringTokenizer st = new StringTokenizer("AM:10:50",":");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
		System.out.println();
		
		StringTokenizer st2 = new StringTokenizer("12+36-8/2 =44","+-/="); 
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken()+" ");
		}
		System.out.println();
		
		StringTokenizer st3 = new StringTokenizer("12+36-8/2 =44","+-/= "); // 공백도 구분자에 포함됨
		while(st3.hasMoreTokens()) {
			System.out.print(st3.nextToken()+" ");
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
