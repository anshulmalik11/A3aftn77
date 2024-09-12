package arrya;

import java.util.Arrays;

public class ZigZac {

	public static void main(String[] args) {
		int[]a= {1,3,5,7,9};int x=0;
		int[]b= {2,4,6,8,10,11,12,13};int y=0;
		int[]c =new int[a.length+b.length];int i=0;
		
		while(i<c.length) {
			
			if(x<a.length) {
				c[i]=a[x];
				x++;i++;
			}
			if(y<b.length) {
				c[i]=b[y];
				y++;i++;
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
