package numberProgramming;

public class HCF {
	
	public static void main (String [] args) {
		
		int a = 24, b = 12;
		int res = (a<b)? a : b;
		int gcd = 0;
		for(int i = 1; i<=res ; i++) {
			if(a%i == 0 && b%i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD "+gcd);
	}

}
