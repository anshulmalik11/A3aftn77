package numberProgramming;

import java.util.Scanner;

public class Sumof_factors{
	public static void main (String []args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int sum = 0;
		int n = s.nextInt();
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
}