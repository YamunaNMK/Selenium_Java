package day2_Task;

import java.util.Scanner;

public class TempConvertor {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("ENter temp in celsius");
double celsius=sc.nextDouble();

double fahren=(celsius *9/5) +32;

System.out.println("Temperature in Fahrenheit is: "+fahren);
 sc.close();


	}

}
