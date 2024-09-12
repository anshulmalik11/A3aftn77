package string;

public class OnlySpecialCharacters {

	public static void main(String[] args) {
		String s = "%$";
		s = s.toLowerCase();
		boolean flag = true;
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >='a'&& ch<='z' || ch>='0' && ch<='9') {
				flag = false; break;
			}
		}
		if(flag == true) {
			System.out.println("Contains only special chars");
		}
		else {
			System.out.println("Not contains only special chars");
		}

	}

}
