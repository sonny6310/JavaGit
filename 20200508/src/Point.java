class Circle{
	Point p;
	int rad;
	public Circle(int x, int y, int r) {
		p=new Point(x,y);
		rad=r;
	}
	public void showCircleInfo() {
		p.showPointinfo();
		System.out.println("반지름: ["+rad+"]");
	}
}

class Point{
	int xpos,ypos;
	public Point(int x, int y) {
		xpos=x;
		ypos=y;
	}
	public void showPointinfo() {
		System.out.println("좌표: ["+xpos+","+ypos+"]");
	}
	public static void main(String[] args) {
		Circle c=new Circle(2,2,4);
		c.showCircleInfo();
	}
}