package array2D;

public class ReverseEachEle {
	public static void main (String []args) {
		for(int i=0;i<row;i++) {
			for(int j=0; j<row; j++) {
				int n = a[i][j];
				int rev =0;
				while(n>0) {
					int rem=n%10;
					rev = rev*10+rem;
					n=n/10;
				}
				a[i][j]=rev;
			}
		}
	}
}
