package numberProgramming;

public class SquareRoot {
	public static void main(String[]args) {
		int n = 25;
		for(int i=1; i<n/2; i++) {
			if(n== i*i) {
				System.out.println("Square root of "+n+" is "+i);
			}
		}
	}
}
