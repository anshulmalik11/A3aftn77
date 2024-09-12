package numberProgramming;

public class Even_digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 39728,sum =0;
		
		while(n>0) {
			int rem = n%10;
			if (rem == 0) {
				sum = sum +rem;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
