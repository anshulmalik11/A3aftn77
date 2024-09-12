package string;

public class TrimMethod {
	public static void main (String[]args) {
		String t = "      good morning         ";
		System.out.println("before trim: "+t.length());
		String s = t.trim();
		System.out.println(t.trim());
		System.out.println("after trim "+s.length());
		
		System.out.println("----without using trim method---");
		
		int st=0, en=t.length()-1;
		
		for(int i=0; i<s.length();i++) {
			if(t.charAt(st)==' ') {
				st++;
			}
			if(t.charAt(en)==' ') {
				--en;
			}
		}
		System.out.println(t.substring(st, en));
		
	}
}
