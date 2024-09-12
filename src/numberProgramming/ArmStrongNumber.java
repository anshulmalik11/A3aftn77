package numberProgramming;

public class ArmStrongNumber {
	public static void main(String[]args) {
		int n = 153,n1=n,n2=n,c=0,sum=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		while(n1!=0) {
			int rem=n1%10;
			int pow =1;
			for(int i=1;i<=c;i++) {
				pow=pow*rem;
			}
			sum=sum+pow;
			n1=n1/10;
		}
		if(n2==sum) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not ArmStrong Number");
		}
	}
}
