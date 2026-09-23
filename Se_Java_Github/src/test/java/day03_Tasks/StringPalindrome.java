package day03_Tasks;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to check palindrome");
		String ip=sc.nextLine(); //hai
		
		String rev="";
		
		for(int i=ip.length()-1;i>=0;i--) {
			rev=rev+ip.charAt(i);
		}
		
		if(ip.equals(rev)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("");
		}
		
sc.close();
	}

}
