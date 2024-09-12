package string;

public class StringContainsVovel {
	public static void main(String[]args) {
		String s = "Awhy";
		s= s.toLowerCase();
		boolean flag = false;
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;break;
			}
		}
		if(flag == true) {
			System.out.println("String contains vovel");
		}
		else {
			System.out.println("String doesn't contains vovel");
		}
	}
}
