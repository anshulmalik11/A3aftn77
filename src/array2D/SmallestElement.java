package array2D;

import java.util.Scanner;

public class SmallestElement {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter row size: ");
		int row = s.nextInt();
		System.out.print("Enter column size: ");
		int col = s.nextInt();
		
		System.out.println("Enter elements: ");
		int[][]a = new int [row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Array Elements are:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int min = a[0][0];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		System.out.println("Smallest ele is: "+min);
	}

}
