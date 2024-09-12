package arrya;

public class Merge {
	public static void main(String[]args) {
		int [] arr1= {1,2,3,4,5};
		int [] arr2= {6,7,8,9,10};
		int [] arr3= new int[arr1.length+arr2.length];
		int j=0;
		for (int k = 0; k < arr3.length; k++) {
			if(k<arr1.length) {
				arr3[k]=arr1[k];
			}
			else {
				arr3[k]=arr2[j];
				j++;
			}
		}
	}
}
