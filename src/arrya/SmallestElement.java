package arrya;

public class SmallestElement {
	public static void main(String[] args) {
		int []a= {40,28,-19,89,82,64,-9,-21};
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("minimum value in array is: "+min);
	}
}
