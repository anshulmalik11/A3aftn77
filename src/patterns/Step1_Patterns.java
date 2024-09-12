package patterns;

public class Step1_Patterns{
	
	public static void main (String []args) {
		int n = 4;
		System.out.println("----------L Shape------");
		
		for(int i = 1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				if(i == n || j == 1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------oppo L shape -----");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------interver L shape-------");
		
		for(int i = 1;i<=n;i++) {
			for(int j =1; j<=n; j++) {
				if(i==n ||j==n ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------oppo inverted L shape-------");
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(i==1|| j == 1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---------C shape---------");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||j==1||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("========Oppo C shape=========");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==n || i==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("=======U shape======");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1||j==n||i==n) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("======inverted U shape=====");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1||j==n||i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("========Box Shape======");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||i==n||j==1||j==n) {
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