package numberProgramming;

public class SwappingWithoutTemp {
	public static void main(String[]args) {
		int a=10, b=20;
		
		System.out.println("Before Swapping");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println();
		System.out.println("After Swapping");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		
		
	}
}
