package numberProgramming;

import java.util.Scanner;

public class ProductOfFactors {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		int pro = 1;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				pro = pro*i;
			}
		}
		System.out.println("product of factors of " + n +": " +pro);
	}
}
