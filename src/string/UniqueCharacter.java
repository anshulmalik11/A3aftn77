package string;

public class UniqueCharacter {
	public static void main (String[] args) {
		String s = "programming";
		char[]a=s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=Character.MAX_VALUE;
				}
			}
			if(a[i]!=Character.MAX_VALUE) {
				System.out.println(a[i]);
			}
		}
	}
}
