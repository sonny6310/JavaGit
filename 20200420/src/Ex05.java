/*
 * p135. Q1
 */
public class Ex05 {
	public static void main(String[] args) {
		for (int gugudan = 2; gugudan < 10; gugudan += 2) {
			for (int dan = 1; dan <= gugudan; dan++) {
				System.out.println(gugudan + " x " + dan + " = " + (gugudan * dan));
			}
			System.out.println();
		}
	}
}