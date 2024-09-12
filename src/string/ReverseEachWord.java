package string;

import java.util.Arrays;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "Hello welcome bye hi";
		String []a = s.split(" ");
		for(int i=0; i<a.length;i++) {
			String str=a[i];
			String rev ="";
			for(int j=str.length()-1;j>=0;j--) {
				char ch = str.charAt(i);
				rev = rev + ch;
			}
			a[i]=rev;
		}
		System.out.println(Arrays.toString(a));
	}
}
