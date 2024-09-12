package arrya;

public class SortedUnsorted {
	public static void main (String[]args) {
		int[]a = {1,2,4,3,5};
		
		boolean flag = true;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				
			}
			else {
				flag = false;
			}
		}
		if(flag == true) {
			System.out.println("array is sorted");
		}
		else {
			System.out.println("array is unsorted");
		}
	}
}
