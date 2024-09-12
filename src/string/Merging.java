package string;

import java.util.Arrays;

public class Merging {
	public static void main (String[]args) {
		String []a = {"a","b","c"};
		String []b = {"x","y","z"};
		int j =0;
		
		String []c = new String[a.length+b.length];
		for(int i=0; i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
