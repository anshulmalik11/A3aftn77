package arrya;

public class Frequency_ofElement {
	public static void main(String[] args) {
		int []a = {10,20,10,30,40,40};
		for(int i=0; i<a.length; i++) {
			int c=1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					c++;
					a[j]= Integer.MAX_VALUE;
				}
			}
			if(a[i]!=Integer.MAX_VALUE) {
				System.out.println(a[i]+"-->"+c);
			}
		}
	}
}
