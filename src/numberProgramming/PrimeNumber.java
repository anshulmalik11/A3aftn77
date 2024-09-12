package numberProgramming;

public class PrimeNumber {
	public static void main(String[]args) {
		int n=13,c=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {// if i starts from 2 then (c==1)        if i<n then (c==0)
			System.out.println("Prime number");
		}
		else {
			System.out.println("Non-Prime number");
		}
		
		//Another logic try
		int sum=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				sum= sum+i;
			}
		}
		if(sum==n) { //if i starts form 1 then n+1
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Non-Prime Number");
		}
	}
}
