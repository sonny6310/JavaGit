
public class Q13_2_2 {



	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3,4},
				{5,6,7},
				{8,9,10,11,12},
				{13,14}
		};
		System.out.println("초기 배열:");
		printArr(arr);
		System.out.println("\n변경된 배열:");
		changeColm(arr);
		printArr(arr);
	}

	public static void changeColm(int[][] arr) {
		int[] temp=arr[arr.length-1];
		for(int i=arr.length-1; i>=0; i--) {
			if(i==0) {
				arr[i]=temp;
			}else {
				arr[i]=arr[i-1];
			}
		}
	}
	
	public static void printArr(int[][] arr) {
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
