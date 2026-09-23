package day03_Tasks;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int ip=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=ip;i++) {
			if(ip%i==0) {
				count++;
			}
		}
		if(count==2)System.out.println("Given num is prime");
		else System.out.println("Not a prime");
		sc.close();
	}

}
