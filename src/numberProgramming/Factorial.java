package numberProgramming;

public class Factorial {
	public static void main(String[]args) {
		int n=5,fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		System.out.println(fac);
	}
}
