package arrya;

import java.util.Scanner;

public class AverageOfOddIndexElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int size = s.nextInt();
		int sum=0,c=0;
		int [] a = new int[size];
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			if(i%2!=0) {
				sum = sum+a[i];
				c++;
			}
		}
		System.out.println("Average of odd index element of given array is: "+sum/c);
		s.close();
	}
}
