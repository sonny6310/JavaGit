class Car{
	protected String number;
	
	public Car(String number) {
		this.number = number;
	}
	public void answer() {
		System.out.println("내 차 번호는 "+number);
	}
}
class ElecCar extends Car{
	private String carVer;
	public ElecCar(String number, String carVer) {
		super(number);
		this.carVer=carVer;
	}
	public void driveCar() {
		System.out.println("자동차가 운전"+carVer);
	}
}
public class Ex02 {
	Ex02(){
		ElecCar ec = new ElecCar("72러2233","최신버전");
		ec.driveCar();
		ec.answer();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
