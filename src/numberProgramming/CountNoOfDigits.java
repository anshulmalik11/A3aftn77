package numberProgramming;

public class CountNoOfDigits {
	public static void main (String []args) {
		int n= 2341,c=0;
		
		while(n!=0) {
			c++;
			
			n=n/10;
		}
		System.out.println(c);
	}

}
