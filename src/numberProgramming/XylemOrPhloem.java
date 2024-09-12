package numberProgramming;

public class XylemOrPhloem {
	public static void main (String[]args) {
		
		int n = 1234, is=0, os=0;
		
		int last = n%10; n=n/10;
		while(n>9) {
			int rem = n%10;
			is = is + rem;
			n=n/10;
		}
		os = last+n;
		if(os == is) {
			System.out.println("Xylem");
		}
		else {
			System.out.println("pholem");
		}
	}
}
