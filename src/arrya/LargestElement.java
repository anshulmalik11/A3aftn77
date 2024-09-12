package arrya;

public class LargestElement {
	public static void main(String[] args) {
		int [] a = {-43,-9,78,46,26,123,75};
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The greatest element in arrays is: "+max);
	}
}
