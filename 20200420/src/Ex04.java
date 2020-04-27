/*
 * p129. Q2
 * 자연수 1부터 시작해서 모든 홀수를 더해 나간다. 그리고 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지,
 * 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자.
 */
public class Ex04 {
	public static void main(String[] args) {
		int a=1;
		int total=0;
		
		while(total<1000) {
			total+=a;
			a+=2;
		}
		
		System.out.println("마지막 수는 "+a+", 합은 "+total);
	}
}