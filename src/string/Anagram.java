package string;

import java.util.Arrays;

public class Anagram {
	// should have same alphabet in both strings
	public static void main(String[] args) {
		String s1 = "care";
		String s2 = "race";
		
		if(s1.length()==s2.length()) {
		
			char []a= s1.toCharArray();
			char []b= s2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			
			String s3 = new String(a);
			String s4 = new String(b);
			
			if(s3.equals(s4)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Length should be same");
		}
	}
}
