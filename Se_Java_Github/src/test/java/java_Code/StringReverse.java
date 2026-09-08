package java_Code;

public class StringReverse {

	public static void main(String[] args) {
		String ip="Madam";
		ip=ip.toLowerCase();
		String rev="";
		StringBuffer sb=new StringBuffer(ip);
		
		System.out.println(sb.reverse());
		
		if(ip.equals(rev)) {
			System.out.println("Given ip string is a Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
