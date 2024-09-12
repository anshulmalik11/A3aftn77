package arrya;

public class HighestSum {
	public static void main(String[] args) {
		//the sum of two element is highest 
		int [] a= {89,21,54,20,5,82,61,92};
		
		int sum = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(sum<a[i]+a[j]) {
					sum = a[i]+a[j];
				}
			}
		}
		System.out.println("The highest sum of two element is: "+sum);
	}
}
