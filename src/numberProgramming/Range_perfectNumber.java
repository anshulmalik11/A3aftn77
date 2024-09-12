package numberProgramming;

public class Range_perfectNumber {
	public static void main (String[]args) {
		for(int n=1;n<=1000;n++) {
			int sum =0;
			for(int i =1;i<n;i++) {
				int rem = n%i;
				if(rem == 0) {
					sum = sum+i;
				}
			}
			if(sum == n) {
				System.out.println(n);
			}
		}
	}
}
	


