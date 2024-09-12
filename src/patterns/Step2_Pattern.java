package patterns;

public class Step2_Pattern {
	public static void main(String[]args) {
		int n =7;
		System.out.println("======Primary-Digonal=====");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("=======Secondary Digonal======");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j == n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----N shape-----");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||j==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
System.out.println("-------Z shape-------");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j==n+1||i==1||i==n) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------Left Arrow------");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||i==1||j==1) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------Right Arrow-----");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||j==n||i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------X shape------");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----- X in Box shape------");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||i+j==n+1||i==1||i==n||j==1||j==n) {
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
