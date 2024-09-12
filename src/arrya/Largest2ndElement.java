package arrya;

public class Largest2ndElement {
	public static void main(String[] args) {
		int []a = {-34,198,7,156,-92,96};
		
//		int max = a[0];
//		for(int i=1; i<a.length; i++) {
//			if(a[i]>max) {
//				max = a[i];
//			}
//		}
//		for(int i=0; i<a.length; i++) {
//			if(a[i]==max) {
//				a[i]=Integer.MIN_VALUE;
//			}
//		}
//		int max2 = a[0];
//		for(int i=1; i<a.length; i++) {
//			if(a[i]>max2) {
//				max2 = a[i];
//			}
//		}
//		System.out.println("Second Largest number is: "+max2);
		
		
		
		// another approach
		
		int max = Integer.MIN_VALUE;
		
		int max2 = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max2 = max;
				max = a[i];
			}
			else if(max2<a[i] && a[i]!=max) {
				max2 = a[i];
			}
		}
		System.out.println("Second largest value is :"+max2);
	}
}
