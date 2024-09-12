package numberProgramming;

public class MinimumDigit {

	public static void main(String[] args) {
		int n = 967;
		int min = Integer.MAX_VALUE;
		
		while(n!=0) {
			int rem = n%10;
			if(min>rem) {
				min = rem;
			}
			n = n/10;
		}
		System.out.println(min);
	}

}
