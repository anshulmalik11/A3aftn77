package arrya;

public class RemoveElement {
	public static void main(String[] args) {
		int []a= {1,3,5,3,2,3,4,5,3,2,12,1,2,5,3,5,2};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]='$';
				}
				
			}
				if(a[i]!='$') {
					System.out.print(a[i]+", ");
				
			}
			
		}
	}
}
