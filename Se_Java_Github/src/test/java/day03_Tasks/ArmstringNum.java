package day03_Tasks;

import java.util.Scanner;

public class ArmstringNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to verify Armstrong number");
		int num=sc.nextInt();
		
		int org=num;
		int arm=0;
		while(num!=0) {
			int lastd=num%10;
			arm+=lastd*lastd*lastd;
			num=num/10;	
		}
		
		if(org==arm) System.out.println("Given is Armstrong num");
		else System.out.println("Not Armstrong number");
			
		sc.close();
	}

}
