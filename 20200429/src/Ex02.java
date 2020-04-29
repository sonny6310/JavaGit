class Car{
	String name;
	String brand;
	String color;
	int price;
	
	public void doPrint(String nm, String br, String co, int pr) {
		name=nm;
		brand=br;
		color=co;
		price=pr;
		
		System.out.println("차종: "+name);
		System.out.println("브랜드: "+brand);
		System.out.println("색깔: "+color);
		System.out.println("가격: "+price);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		
		car1.doPrint("모닝", "기아", "레드", 1500);
		System.out.println();
		car2.doPrint("소나타", "현대", "화이트", 2000);
		System.out.println();
		car3.doPrint("그랜저", "현대", "그레이", 5000);
	}
}
