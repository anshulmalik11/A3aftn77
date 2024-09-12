package arrya;

import java.util.Arrays;
import java.util.Scanner;

public class EvenIndexElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of Array: ");
		int size = s.nextInt();
		int []a = new int[size];
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.print("Even index elements are: ");
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				System.out.print(a[i]+", ");
			}
		}
		s.close();
	}
}
