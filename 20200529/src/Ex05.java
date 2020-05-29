class NCBox<L,R>{
	L name;
	R count;
	public NCBox(L name, R count) {
		super();
		this.name = name;
		this.count = count;
	}
	@Override
	public String toString() {
		return "NCBox [name=" + name + ", count=" + count + "]";
	}
}
public class Ex05 {
	Ex05(){
		NCBox<String, Integer> nb1 = new NCBox<String, Integer>("사과",30);
		System.out.println(nb1);
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
