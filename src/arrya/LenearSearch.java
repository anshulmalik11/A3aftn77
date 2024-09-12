package arrya;

import java.util.Scanner;

public class LenearSearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = s.nextInt();
		int []a = new int [size];
		System.out.println("Enter element of array");
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.print("Enter the Element to search: ");
		int ele = s.nextInt();
		s.close();
		boolean flag = false;
		for(int i=0; i<a.length; i++) {
			if(a[i]==ele) {
				flag = true;
				System.out.println("Element found");
				break;
			}
			if(flag = false) {
				System.out.println("Element not found");
			}
		}
	}
}
