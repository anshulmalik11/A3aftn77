package numberProgramming;

public class ProductOfDigits{
	public static void main (String []args) {
		int n = 1234,pro=1;
		while(n!=0) {
			int rem = n%10;
			pro = pro*rem;
			n=n/10;
		}
		System.out.println(pro);
	}
}