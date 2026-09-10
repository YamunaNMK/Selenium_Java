package day2_Task;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p=sc.nextDouble();
		System.out.println("Enter rate of interest");
		double r=sc.nextDouble();
		System.out.println("Enter number of years (time duration)");
		double n=sc.nextDouble();
		
		double sint= (p*n*r)/100;
		System.out.println("Simple Interest is:"+sint);
		
		sc.close();

	}

}
