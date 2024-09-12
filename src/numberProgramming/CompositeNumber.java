package numberProgramming;

public class CompositeNumber {
	public static void main(String[]args) {
		int n=11,c=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c>0) {
			System.out.println("composite number");
		}
		else {
			System.out.println("Prime Number");
		}
	}
}
