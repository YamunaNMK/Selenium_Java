package java_Code;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String input=sc.next();
		input=input.toLowerCase();
		String rev="";
		StringBuffer sb=new StringBuffer(input);
		rev=sb.reverse().toString();
		System.out.println(sb.reverse());
		
		if(input.equals(rev)) {
			System.out.println("Entered name is palindrome");
		}
		else
			System.out.println("Not a palindrome");
		sc.close();

	}

}
