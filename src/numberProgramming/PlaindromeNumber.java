package numberProgramming;

public class PlaindromeNumber {
	public static void main (String[]args) {
		int n=1291,n1=n,rev=0;
		
		while(n!=0) {
			int rem= n%10;
			rev = (rev*10)+rem;
			n=n/10;
		
		}
		System.out.println(n);//n became 0 that's why we are using another conatainer n1
		if(n1==rev) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	}

}
