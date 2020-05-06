class Circle {
	
	double rad;
	final double PI=3.14;
	
//	public Circle(double r) {
//		rad = r;
//	}
	
	public double getArea() {
		return rad*rad*PI;
	}
	
	public void setRad(double r) {
		if(r<0) {
			rad=0;
			return;
		}
		rad=r;
	}

}
public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRad(1.5);
		System.out.println("반지름 "+c.rad+"의 원넓이는 "+c.getArea());
		
		c.setRad(5);
		System.out.println("반지름 "+c.rad+"의 원넓이는 "+c.getArea());
		
		c.setRad(-3);
		System.out.println("반지름 "+c.rad+"의 원넓이는 "+c.getArea());
		
		c.rad = -4;    // 컴파일 오류 나지 않음.
		System.out.println("반지름 "+c.rad+"의 원넓이는 "+c.getArea());
	}
}