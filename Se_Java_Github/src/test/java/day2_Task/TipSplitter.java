package day2_Task;

import java.util.Scanner;

public class TipSplitter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		double bill=sc.nextDouble();
		
		System.out.println("Enter the tip in percentage: ");
		double tippercent=sc.nextDouble();
		
		System.out.println("Enter the number of persons: ");
		int n=sc.nextInt();
		
		double tipAmt=bill*tippercent/100;	
		System.out.println("Total tip amount is:"+tipAmt);
		
		double totalBill=bill+ tipAmt;	
		System.out.println("Total Bill amount is:"+totalBill);
		
		double billPerHead=totalBill/n;	
		System.out.println("Amount per Head is:"+billPerHead);
		
		sc.close();

	}

}
