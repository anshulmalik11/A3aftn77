package numberProgramming;

public class StrongNumber {
	public static void main (String[]args) {
		int n=145,n1=n,sum=0;
		while(n!=0) {
			int fac=1;
			int rem=n%10;
			for(int i=1;i<=rem;i++) {
				fac*=i;
			}
			n=n/10;
			sum+=fac;
		}
		if(n1==sum) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not Strong Number");
		}
		
	}
}
