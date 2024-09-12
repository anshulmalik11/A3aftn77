package arrya;

public class Smallest2ndElement {
	public static void main(String[] args) {
		int []a= {12,-9,67,-18,98,6,-21};
		
		int min = Integer.MAX_VALUE;
		int min2 = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(min>a[i]) {
				min2 = min;
				min = a[i];
			}
			else if(min2<a[i] && min!=a[i]) {
				min2=a[i];
			}
		}
		System.out.println("Second min value is: "+min2);
	}
}
