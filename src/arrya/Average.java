package arrya;

public class Average {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
		int c =0, sum=0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
			c++;
		}
		System.out.println(sum +", "+c);
		System.out.println("Average of Array: "+(double)sum/c);
	}
}
