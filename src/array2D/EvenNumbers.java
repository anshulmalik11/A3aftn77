package array2D;

import java.util.Scanner;

public class EvenNumbers {
	public static void main (String []args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of Rows: ");
		int row = s.nextInt();
		System.out.print("Enter column: ");
		int col = s.nextInt();
		
		int [][]a = new int [row][col];
		System.out.println("Enter ele:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Array is");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Printing even Elements:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(a[i][j]%2==0) {
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
