package string;

public class Demo {
	
	public static void main (String []args) {
		String s1= "java"; //ox1
		String s2 = new String ("java"); //ox2
		String s3 = "java"; //ox1
		String s4 = new String ("java"); //ox3
		
		System.out.println(s1==s2); // it is comparing the reference address ox1 == ox2 => false
		System.out.println(s1==s3); // ox1==ox1 => true
		System.out.println(s2==s4); // ox2==ox3 => false
		System.out.println(s1.equals(s2));
		
	}

}
