package numberProgramming;

public class Number_Starts_wt_EvenOrOdd {
	public static void main (String []args) {
		int n = 4234;
		
		while(n>9) {
			n = n/10;
		}
			if(n%2!=0) {
				System.out.println("Starting with odd number");
			}
			else {
				System.out.println("Starting with even number");
		}
	}
}
