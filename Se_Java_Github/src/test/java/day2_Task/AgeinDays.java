package day2_Task;

import java.util.Scanner;

public class AgeinDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age in years");
		int yrs= sc.nextInt();
		
		int ageDays=yrs*365;
		System.out.println("Age in Days is"+ageDays);
		
		sc.close();
		
	}

}
