class KiaCar extends Car{
	public void tellInfo(){
		tellName();
	}
}
class SamsungCar extends Car{
	public void tellInfo(){
		tellName();
	}
}
class SsangyongCar extends Car{
	public void tellInfo(){
		tellName();
	}
}

public class Car {
	String name;
	String brand;
	public void tellName() {
		System.out.println("-----------------------");
		System.out.println("브랜드: "+brand);
		System.out.println("차종: "+name);
		System.out.println("-----------------------");
	}
}
