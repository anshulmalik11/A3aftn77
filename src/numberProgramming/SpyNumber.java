package numberProgramming;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123,sum=0,pro=1;
		
		while(n>0) {
			int rem = n%10;
			sum = rem+sum;
			pro = rem*pro;
			n = n/10;
		}
		System.out.println("sum is:"+sum+" product is:"+pro);
		if(sum == pro) {
			System.out.println("This is spy a number");
		}
		else {
			System.out.println("This is not a spy number");
		}
	}

}
