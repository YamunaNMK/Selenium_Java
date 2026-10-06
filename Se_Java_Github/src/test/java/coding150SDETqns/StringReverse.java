package coding150SDETqns;

public class StringReverse {
	
	public static String reverse(String str) {
		String strrev="";
		for(int i=str.length()-1;i>=0;i--) {
			strrev+=str.charAt(i);
			}
				
		return strrev;
	}

	public static void main(String[] args) {
		
             System.out.println(reverse("Yamuna"));
	}

}
