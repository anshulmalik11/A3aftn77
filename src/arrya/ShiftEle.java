package arrya;

import java.util.Arrays;

public class ShiftEle {
	public static void main (String [] args) {
	int[]a = {12,0,-93,0,0,2,0,0,34,0,65};
	int[] b= new int[a.length]; int j=0;
	for(int i=0; i<a.length; i++) {
		if(a[i]==0) {
			b[j]=a[i];
			j++;
		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			b[j]= a[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));

	}
}
