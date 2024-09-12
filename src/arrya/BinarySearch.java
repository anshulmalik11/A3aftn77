package arrya;

import java.util.Arrays;

public class BinarySearch{
	public static void main(String[] args) {
		int [] a = {5,3,4,1,2};
		Arrays.sort(a);
		int l = 0;
		int r = a.length-1;
		int num =2;
		boolean flag = false;
		
		while(l<=r) {
			int mid = (l+r)/2;
			if(a[mid]==num) {
				flag = true;
				System.out.println("element found");
				break;
			}
			else if(num>a[mid]) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		if(flag == false) {
			System.out.println("element not found");
		}
		
	}
}