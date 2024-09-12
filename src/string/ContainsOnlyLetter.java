package string;

public class ContainsOnlyLetter {

	public static void main(String[] args) {
		String s = "welcome1";
		s = s.toLowerCase();
		boolean flag = true;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch<='z') {
				//do nothing
			}
			else {
				flag = false;break;
			}
		}
		
		if(flag == true) {
			System.out.println("String contains only letters");
		}
		else {
			System.out.println("String not only conatins letters");
		}
	}

}
