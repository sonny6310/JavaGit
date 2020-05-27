import java.util.Random;

public class Ex04 {
	Ex04(){
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(10));
		}
		
		System.out.println();
		
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(10));
		}
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}
