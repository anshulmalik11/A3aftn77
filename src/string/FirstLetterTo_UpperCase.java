package string;

public class FirstLetterTo_UpperCase {
	public static void main (String []args) {
		String s = "apple";
		
		for(int i=0; i<s.length();i++) {
			char ch=s.charAt(i);
			if(i==0 && ch>='a' && ch<='z') {
				int n=ch-32;
				System.out.print((char)n);
			}
			else {
				System.out.print(ch);
			}
		}
	}
}
