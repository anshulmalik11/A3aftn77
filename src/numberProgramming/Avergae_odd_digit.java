package numberProgramming;

public class Avergae_odd_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7893, sum = 0, count = 0;
		
		while(n>0) {
			int rem = n%10;
			if(rem%2 != 0) {
				sum = sum +rem;
				count++;
			}
			n=n/10;
		}
		double avg = sum/count;
		System.out.println("avg: "+ avg);
		
	}

}
