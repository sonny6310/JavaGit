// Wrapper class Integer형을 직접 만들어보면 이렇지 않을까
class MyWrapperInteger{
	private int _int=0;
	
	public MyWrapperInteger(int _int) {
		super();
		this._int=_int;
	}
	
	public int get_int() {
		return _int;
	}

	public void set_int(int _int) {		
			this._int = _int;
	}
	@Override
	public String toString() {
		return _int+"";
	}
}

/*
기본형(primitive type) 변수도 때로는 객체로 다루어져야 하는 경우가 있다.

1. 매개변수로 객체가 요구 될때.

2. 기본형 값이 아닌 객체로 저장해야 할 때.

3. 객체간의 비교가 필요할 때. 등등

이 때 사용되는 것이 wrapper class 이다.
*/

public class Ex01 {
	Ex01(){
		Integer integer = new Integer(3);
		System.out.println(integer.toString());
		System.out.println(integer);
		
		Integer integer2 = new Integer("33");
		System.out.println(integer2.toString());
		System.out.println(integer2);
		
		System.out.println();
		
		System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE = "+Integer.MIN_VALUE);
		
		System.out.println();
		
		MyWrapperInteger mwi = new MyWrapperInteger(3);
		System.out.println("mwi = "+mwi);
		MyWrapperInteger mwi2 = new MyWrapperInteger(2);
		System.out.println("mwi2 = "+mwi2);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
