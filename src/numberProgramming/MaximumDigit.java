package numberProgramming;

public class MaximumDigit {
	public static void main(String[] args) {
		int n = 87065;
		int max = Integer.MIN_VALUE;
		
		while(n!=0) {
			int rem = n%10;
			if(rem>max) {
				max = rem;
			}
			n = n/10;
		}
		System.out.println(max);
	}
}
