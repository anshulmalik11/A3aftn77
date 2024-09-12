package arrya;

import java.util.Arrays;

public class Reverse_EachElement{
	
	public static void main(String[] args) {
		int [] a= {14,25,38,45,63,74,81,96};
		
		for(int i=0;i<a.length;i++) {
			int rev=0;
			while(a[i]!=0) {
				int rem=a[i]%10;
				rev = (rev*10)+rem;
				a[i]=a[i]/10;
			}
			System.out.println(Arrays.toString(a));
		}
	}
}