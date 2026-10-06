package day4_utility;

public class UtilityResuableFunctions {
	
	public static String isEven(int num) {
	 if(num%2==0) return ("Given Num is Even");
	 else return "Num is Odd";
	
	}
	
	public static String maxofthree(int a,int b,int c){
				
		if(a>b && a>c) return("a is greater");
		else if(b>a && b>c) return("b is greater");
		else return("c is greater");
	}
	
	public static String reverseString(String ip) {
		String reverse="";
		StringBuffer sb=new StringBuffer(ip);
		reverse=sb.reverse().toString();
		return reverse;
		
	}


}
