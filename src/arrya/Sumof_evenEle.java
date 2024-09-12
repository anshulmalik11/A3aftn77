package arrya;

public class Sumof_evenEle {
	public static void main(String[] args) {
		int sum = 0;
		int []a= {2,4,7,5,2,1,7};
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of Even Element: "+sum);
	}
}
