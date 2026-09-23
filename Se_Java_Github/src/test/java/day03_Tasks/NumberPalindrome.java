package day03_Tasks;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number to find palindrome"); 
	 int num=sc.nextInt(); // 123
	 
	 int org=num;
	 int rev=0;
	  
	 while (num!=0) {
		 int rem=num%10; //to find last digit num=3 ;2; 1
		 rev=rev*10+rem; // rev=0+3 ; 30+2=32 ; 320+1=321
		 num=num/10; // remove the last digit num=12 ; 1 ; 
	 }
	 
	 if(org==rev)System.out.println("Number is palindrome");
	 else System.out.println("Not a palindrome");

	}

}
