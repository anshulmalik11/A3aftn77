package arrya;

import java.util.Arrays;

public class BubbleSort{
	
	public static void main(String[] args) {
		
		int [] a = {4,-9,2,6,-4,-8,5};
		
		for (int i = 0; i < a.length-1; i++) {
			int flag = 0;
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag =1;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
}