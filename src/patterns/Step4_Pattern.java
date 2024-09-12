package patterns;

public class Step4_Pattern {
	public static void main(String[]args) {
		int n=5;
		System.out.println("------Upper Pyramid-----");
		for(int i=1; i<=n; i++) {
			for(int j=1; i<2*n-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
