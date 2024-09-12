package arrya;

public class Sumof_oddElements {
	public static void main(String[] args) {
		int sum = 0;
		int [] a = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				sum = sum+a[i];
			}
		}
		System.out.print("Sum of Odd Elements: "+sum);
	}
}
