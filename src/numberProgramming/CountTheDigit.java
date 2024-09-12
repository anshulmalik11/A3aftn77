package numberProgramming;

public class CountTheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378641;
		int count = 0;
		int sum = 0;
		int mul = 1;
		
		while(n>0) {
			int rem = n%10;
			sum = rem + sum;
			mul = rem*mul;
			n = n/10;
			count++;
		}
		
		System.out.println("no of digits are: "+count);
		System.out.println("sum of digits is: "+sum);
		System.out.println("mul of digits is: "+mul);
	}

}
