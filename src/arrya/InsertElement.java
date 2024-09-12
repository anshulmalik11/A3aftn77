package arrya;

import java.util.Arrays;

public class InsertElement {
	public static void main (String[]args) {
		int[]a = {100,200,500,700};
		int[]b = new int[a.length+3];
		
		int ele1 = 300, ind1 = 2,j=0;
		int ele2 = 400, ind2 = 3;
		int ele3 = 600, ind3 = 5;
		for (int i = 0; i < b.length; i++) {
			
			if(i==ind1) {
				b[i]=ele1;
			}
			else if(i==ind2) {
				b[i]=ele2;
			}
			else if(i==ind3) {
				b[i]=ele3;
			}
			else {
				b[i]=a[j];
				j++;
			}
		}
		System.out.println("after Inserting Element = " +Arrays.toString(b));
		
	}
}
