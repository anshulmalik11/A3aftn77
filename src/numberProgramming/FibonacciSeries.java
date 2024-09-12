package numberProgramming;

public class FibonacciSeries {
	public static void main (String[]args) {
		int n1=0,n2=1,n3,st=5,en=50;
		for(int i=st; i<=en; i++) {
			if(n1>=st && n1<=en) {
				System.out.println(n1);
			}
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
	}
}
