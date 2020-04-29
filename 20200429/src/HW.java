import java.util.Scanner;

class Triangle{
	double length;
	double height;
	
	public Triangle(double lth, double hit) {
		length=lth;
		height=hit;
	}

	public void doPrint() {
		System.out.println("밑변이 "+length+"고 높이가 "+height+"인\n삼각형의 넓이는 "+((length*height)/2)+"이다.");
	}
}
public class HW {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("밑변, 높이 입력: ");
			double slth=scan.nextDouble();
			double shit=scan.nextDouble();
			Triangle triangle=new Triangle(slth,shit);
			triangle.doPrint();
		}
	}
}
