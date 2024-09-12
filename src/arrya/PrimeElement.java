package arrya;

public class PrimeElement{
	
	public static void main(String[] args) {
		
		int[]a = {9,3,22,101,43,25,65,73};
		
		for(int i=0; i<a.length; i++) {
			int c = 0;
			for (int j = 1; j <= a[i]; j++) {
				if(a[i]%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(a[i]+", ");
			}
		}
	}
}