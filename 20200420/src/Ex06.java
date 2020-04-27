/*
 * p135. Q2
 */
public class Ex06 {
	public static void main(String[] args) {
		
		for(int A=0; A<10; A++) {
			for(int B=0; B<10; B++) {
				if( (10*A+B)+(10*B+A)==99 ) {
					System.out.println("  "+A+" "+B+"\n+ "+B+" "+A+"\n------"+"\n  9 9\n");
				}
			}
		}
	}
}