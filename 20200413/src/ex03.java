
public class ex03 {
	public static void main(String[] args) {
		short num1=10;
		short num2=20;
//		short result=(short)num1+(short)num2;
//		정수형 덧셈시 자료형에 상관없이 int형 덧셈을 진행하므로 오류발생.
		
		int result=num1+num2; // 오류 발생하지 않음.
		System.out.println(result);
	}
}
