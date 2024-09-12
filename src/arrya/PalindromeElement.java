package arrya;

public class PalindromeElement {
	public static void main (String[]args) {
		int []a = {53,22,515,121,77,23};
		
		for(int i=0; i<a.length;i++) {
			int n=a[i];
			int rev =0;
			
			while(n!=0) {
				int rem = n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(rev==a[i]) {
				System.out.println(a[i]);
			}
		}
	}
}
