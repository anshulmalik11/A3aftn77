package numberProgramming;

public class TernaryOperatorGreatestOfThree {
	public static void main (String []args) {
		int a=10, b=20, c=30;
		
		int res = a>b ? (a>c?a:c):(b>c?b:c);
		System.out.println("Greatest of three: "+res);
	}
}
