package numberProgramming;

public class HappyNumber {
	public static void main (String[]args) {
		int n =13;
		while(true) {
			int sum=0;
			while(n!=0) {
				int rem = n%10;
				int sq=rem*rem;
				sum = sum +sq;
				n=n/10;
			}
			if(sum == 1) {
				System.out.println("happy number");
			}
			else {
				System.out.println("sad number");
			}
			n=sum;
		}
		
	}
}
