package numberProgramming;

public class RangeNeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 0; n<=1000; n++) {
		int sq=n*n;
		int sum = 0;
		while(sq>0) {
			int rem = sq%10;
			sum = sum + rem;
			sq=sq/10;
		
		}
		if(sum == n) {
			System.out.println(n);
		}
		
		}
	}
}
