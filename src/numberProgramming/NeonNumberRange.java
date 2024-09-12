package numberProgramming;

public class NeonNumberRange {
	public static void main (String[]args) {
		for(int i=1; i<=1000;i++) {
			int sq = i*i, sum = 0, s1=sq;
			while (sq!=0) {
				int rem=sq%10;
				sum = sum+rem;
				sq = sq/10;
			}
			if(sum == i) {
			
				System.out.println(i+" "+ s1);
			}
		}
	}
}
