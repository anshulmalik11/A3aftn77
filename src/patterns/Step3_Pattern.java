package patterns;

public class Step3_Pattern {
	public static void main(String []args) {
		int n = 5;
		System.out.println("-----Left Upper Triangle------");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i>=j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Right Upper Triangle-----");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j >= n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------Left Down Trianle--------");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----Right Down Trianlge-----");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j>=i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------combine left and right upper trianle----");
		
		int m=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i>=j||i+j>=2*n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----combine left down left upper-----");
		
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j<=n+1||i-j>=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------combine left and right down triangle----");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i+j<=n+1|| j-i>=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----combine all 4 triangles-----");
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j<=n+1||j-i>=n-1||i-j>=n-1||i+j>=n*3-1) {
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
