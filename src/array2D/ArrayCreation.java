package array2D;

import java.util.Scanner;

public class ArrayCreation {
	public static void main (String []args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter row size: ");
		int row = s.nextInt();
		System.out.print("Enter column size: ");
		int col = s.nextInt();
		
		int[] []a = new int[row][col];
		
		System.out.println("Enter array Element:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
