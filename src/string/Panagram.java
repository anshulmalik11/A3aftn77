package string;

public class Panagram {
	//string should contains all 26 alphabets
	public static void main(String[] args) {
//		String s1 = "abcdefghijklmnopqrstuvwxyz"
		String s = "when zombies arrive, quickly fax judge pat";
		char []a = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=0; j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]='?';
			}
			}
		}
		int c = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>='a' && a[i]<='z') {
				c++;
			}
		}
		if(c==26) {
			System.out.println("panagram");
		}
		else {
			System.out.println("Not Panagram");
		}
	}
}

//Assignment String s = "my name is string"
// output should be - My Name Is Smith