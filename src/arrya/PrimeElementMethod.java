package arrya;

import java.util.Scanner;

public class PrimeElementMethod {
	static int prime (int n) {
		int c =0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = s.nextInt();
		int []a = new int [size];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			int p = prime(a[i]);
			if(p==1) {
				System.out.print(a[i]+", ");
			}
		
		}
		s.close();
	}
}
