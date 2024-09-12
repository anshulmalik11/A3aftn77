package arrya;

public class ArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,2,10,2,5};
		for(int i=0;i<a.length;i++) {
			int c =1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					c++;
					a[j]=Integer.MAX_VALUE;
				}
				}
			if(a[i]!=Integer.MAX_VALUE) {
				System.out.println(a[i]+"->"+c);
			}
		}
	}

}
