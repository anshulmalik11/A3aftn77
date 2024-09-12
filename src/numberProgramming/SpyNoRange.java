package numberProgramming;

public class SpyNoRange {

	public static void main(String[] args) {
		for(int i = 1; i<=1000;i++) {
			int sum = 0, pro =1, n=i;
			
			while(n>0) {
				int rem = n%10;
				sum = sum+rem;
				pro = pro*rem;
				n = n/10;
			}
			if(sum == pro) {
				System.out.println("this is a Spy number: " +i);
			}
		}
	}

}
