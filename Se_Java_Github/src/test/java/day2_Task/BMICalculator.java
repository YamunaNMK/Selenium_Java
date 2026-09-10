package day2_Task;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter weight in Kg");
		double wt=sc.nextDouble();
		System.out.println("Enter height in meters");
		double ht=sc.nextDouble();
		
		double bmi=wt/(ht*ht);
		System.out.println("BMI"+bmi);
		
		if(bmi<18.5) {System.out.println("Person is under weight");}
		else if(bmi<25) {
			System.out.println("Person is Normal weight");
		}
		else if(bmi<30) {
			System.out.println("Over weight");
		}
		else System.out.println("Obese");

	sc.close();
	}

}
