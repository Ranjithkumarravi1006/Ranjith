package forLoop;

public class InASingleLine {
	public static void main(String[] args) {
		String a="ranjith";
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		System.out.println(temp);
	}

}
