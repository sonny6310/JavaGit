
public class Q13_1 {
	public static void main(String[] args) {
		int[] number= {1,2,3,4,5};
		System.out.println("min= "+minValue(number));
		System.out.println("max= "+maxValue(number));
	}

	public static int minValue(int[] arr) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max=arr[0];
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
		return max;
	}
}
