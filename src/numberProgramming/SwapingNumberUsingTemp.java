package numberProgramming;

public class SwapingNumberUsingTemp {

	public static void main(String[] args) {		
		int a=10,b=20;
		System.out.println("Before Swapping");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		System.out.println();
		int temp = a;
		a=b;
		b = temp;
		
		System.out.println("After Swapping");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}

}
