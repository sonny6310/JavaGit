
public class Q11 {

	public static void main(String[] args) {
		String str1="990925-1012999";
		
		System.out.println("Q11_1:");
		System.out.println("1.");
		String[] str2=str1.split("-");
		System.out.println(str2[0]+" "+str2[1]);
		System.out.println("2.");
		System.out.println(str1.substring(0,6)+" "+str1.substring(7));
		//substring(1,5) : 1번째부터 5번째 전까지(4번째까지) 출력, substring(5) : 5번째부터 끝까지 출력 
		System.out.println();
		System.out.println("Q11_2:");
		StringBuilder str_=new StringBuilder(str1);
		str_.replace(6, 7, " ");
		// public StringBuilder replace(int start, int end, String str) : start부터 end이전까지의 내용을 str로 대체
		// 참고:
		// public StringBuilder append : 기존 문자열 끝에 문자열 추가    ex) str_.append(4567);
		// public StringBuilder delete(int start, int end) : start부터 end이전까지의 내용 삭제
		// public StringBuilder reverse() : 기존 문자열 내용 뒤집기
		// public String toString() : 저장된 문자열의 내용을 담은 String인스턴스의 생성 및 반환 
		System.out.println(str_.toString());
	}

}
