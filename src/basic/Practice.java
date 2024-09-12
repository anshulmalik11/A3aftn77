package basic;

import java.util.Arrays;

public class Practice {
	public static void main (String []args) {
		int []a = {1,2,3,4,5,6,7};
		for(int i=a.length-1; i>=0;i--) {
			System.out.print(a[i]+", ");
		}
		System.out.println();
		int [] b= new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
		
		int k = a.length-1;
		for(int i=0; i<a.length/2; i++) {
			int temp = a[i];
			a[i]=a[k];
			a[k]=temp;
			k--;
		}
		System.out.println(Arrays.toString(a));
	}
}
