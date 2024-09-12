package numberProgramming;

public class SumOfFactorial {
	//sum of factorial of all the given digits
	public static void main(String[]args) {
		int n=1453,sum=0;
		while(n!=0) {
			int rem = n%10;
			int fac=1;
			
			for(int i=1; i<=rem; i++) {
				fac*=i;
			}
			System.out.println("Factorial of "+rem+" is :"+fac);
			n=n/10;
			sum=sum+fac;
		}
		System.out.println("Sum of factorials is: "+sum);
	}
}
