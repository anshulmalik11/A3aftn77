package string;

public class StringMethods {
	public static void main(String[]args_) {
		String s1= "java";
		String s2 = "java";
		System.out.println(s1==s2);
		System.out.println("---Equals Method-----");
		System.out.println(s1.equals(s2));
		
		System.out.println("-----length------");
		String s ="hello";
		System.out.println(s.length());
		
		System.out.println("----charAt(int index)----");
//		System.out.println(s.charAt(1));
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("----toUpperCase()-----");
		System.out.println(s.toUpperCase());
		
		System.out.println("----toLowerCase()-----");
		System.out.println(s.toLowerCase());
		
		System.out.println("substring(int begin index)-----");
		System.out.println(s.substring(10));
		
		System.out.println("---substring(int begin index, int ending index)-----");
		System.out.println(s.substring(10, 15));
		
		System.out.println("------trim()-----"); // it will remove starting and ending white spaces in string
		System.out.println(s.trim());
		
		System.out.println("---isBlank and isEmpty method---");
		String b="";
		System.out.println(b.isEmpty()); //length should be zero
		System.out.println(b.isBlank());
		
		System.out.println("----indexOf()-------");
		String i= "welcome";
		System.out.println(i.indexOf(c));
		
		
		
		
	}
}
