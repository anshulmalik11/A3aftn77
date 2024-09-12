package numberProgramming;

public class NeonNumber{
	
	public static void main (String []args) {
		int n = 9, sum = 0;
		int n1=n*n;
		
		while(n1!=0) {
			int rem = n1%10;
			sum = rem + sum;
			n1=n1/10;
		}
		if(sum == n) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Non-Neon Number");
		}
	}
}