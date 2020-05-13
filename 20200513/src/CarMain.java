
public class CarMain {
	public CarMain() {
		KiaCar kc = new KiaCar();
		kc.brand = "Kia";
		kc.name = "K5";
		kc.tellInfo();
		
		SamsungCar sc = new SamsungCar();
		sc.brand = "Samsung";
		sc.name = "QM6";
		sc.tellInfo();
		
		SsangyongCar ssc = new SsangyongCar();
		ssc.brand = "Ssangyong";
		ssc.name = "코란도";
		ssc.tellInfo();
	}
	public static void main(String[] args) {
		new CarMain();
	}
}
