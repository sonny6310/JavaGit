
public class Ex01 {

	public static void main(String[] args) {
		showString("Funny String");
		String a="MyString";
		showString(a);
		System.out.println("\n"+a.contentEquals("MyString")+"\n");  // 스트링 비교시 == 쓰지말것! 이유:Ex02참고

		String split_ = "a,b,c,d,e";
		String[] split=split_.split(",");  // ,을 기준으로 split_을 잘라서 배열에 넣음
		for(String temp:split) {
			System.out.println("temp="+temp);
		}
		System.out.println();
		//ex)
		String splitTest_="123-456-7890";
		String[] splitTest=splitTest_.split("-");
		// splitTest_를 - 기준으로 잘라서 0번째 배열로 123, 1번째 배열로 456, 2번째 배열로 7890이 splitTest에 들어간다.	
		for(String Test:splitTest) {
			System.out.println("Test="+Test);    
		}
	}

	private static void showString(String string) {
		System.out.println(string);
		System.out.println(string.length());
	}
}
	