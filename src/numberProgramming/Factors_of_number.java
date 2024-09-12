package numberProgramming;

import java.util.Scanner;

public class Factors_of_number{
	public static void main (String []args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		System.out.println("Factor of "+n+" are:");
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}