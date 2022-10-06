package forLoop;

public class reverseString {
	public static void main(String[] args) {
		String a = "ranjith";
		char b ;
		 String c ="";
		for( int i=0;i<a.length();i++) {
			b= a.charAt(i);
			c = b+c;
		}
		System.out.println(c);
		
	}

}
