package string;

public class Palindrome {
	public static void main (String[]args) {
		String s = "nitin";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			rev = rev+c;
		}
		System.out.println(s+"-->"+rev);
		if(s.equals(rev)) 
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
