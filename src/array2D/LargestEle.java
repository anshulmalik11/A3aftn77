package array2D;

import java.util.Scanner;

public class LargestEle {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter row size: ");
		int row = s.nextInt();
		System.out.print("Enter col size: ");
		int col = s.nextInt();
		//array creation
		int [][]a= new int[row][col];
		
		System.out.println("Enter array Element:");
		for(int i=0;i<row;i++) {
			for(int j=0; j<col; j++) {
				a[i][j]= s.nextInt();
			}
		}
		System.out.println("Array elements are");
		for(int i=0;i<row;i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int max=a[0][0];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println("Largest ele: "+max);
	}
}
