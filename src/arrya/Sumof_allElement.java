package arrya;

import java.util.Arrays;
import java.util.Scanner;

public class Sumof_allElement {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of Array: ");
		int sum =0;
		int size = s.nextInt();
		int []a= new int[size];
		
		System.out.println("Enter Elements: ");
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.print("Sum of all Elements: "+sum);
		s.close();
	}
}
