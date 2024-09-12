package numberProgramming;

public class ExtractAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87654;
		int count = 0;
		
		while(n>0) {
			int rem = n%10;
			System.out.println(rem);
			n=n/10;
			count++;
		}
		System.out.print("Total digits are: "+count);
	}

}
