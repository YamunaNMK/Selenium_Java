package day03_Tasks;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get table");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+(num*i)); //2*1=2
		}
sc.close();
	}

}
