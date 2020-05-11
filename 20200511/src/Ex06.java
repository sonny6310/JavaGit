
public class Ex06 {
	Ex06(){
		int[] temp1=new int[10];   
		int temp2[]=new int[10];        // 차이 없음
		System.out.println("temp1.length: "+temp1.length);
		System.out.println("temp2.length: "+temp2.length);
		
		temp1[0]=10;
		for(int i=0; i<10; i++) {
			System.out.println("[] temp1= "+temp1[i]);
		}
		temp2[0]=20;
		for(int i=0; i<10; i++) {
			System.out.println("temp2["+i+"]= "+temp2[i]);
		}
	}
	public static void main(String[] args) {
		new Ex06();
	}

}
