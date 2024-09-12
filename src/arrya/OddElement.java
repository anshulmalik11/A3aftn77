package arrya;

import java.util.Arrays;
import java.util.Scanner;

public class OddElement {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of Array: ");
		int size = s.nextInt();
		int []a = new int[size];
		
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.print("Odd Elements: ");
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+", ");
			}
		}
		s.close();
	}
}
