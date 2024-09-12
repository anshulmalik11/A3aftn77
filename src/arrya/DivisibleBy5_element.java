package arrya;

import java.util.Scanner;

public class DivisibleBy5_element {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = s.nextInt();
		int []a= new int[size];
		for(int i=0; i<a.length; i++) {
			a[i]= s.nextInt();
		}
		System.out.print("Elements which are divisible by 5 are: ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%5==0) {
				System.out.print(a[i]+", ");
			}
		}
		s.close();
	}
}
