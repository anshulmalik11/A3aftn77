package arrya;

public class PalindromeArray {
	public static void main (String []args) {
		int[]a = {1,2,3,4,3,2,1};
		boolean flag = true;
		int st=0,en=a.length-1;
		
		for(int i =0;i<a.length/2;i++) {
			if(a[st]==a[en]) {
				st++;en--;
			}
			else {
				flag = false;break;
			}
		}
		if(flag == true) {
			System.out.println("Array is Palindrome");
		}
		else {
			System.out.println("Array is not Plaindrome");
		}
	}
}
