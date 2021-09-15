package Hareprograms;

import java.util.Scanner;

public class LargestOfNumber {

	public static void main(SImutiable[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in); 
		System.out.println("enter first number:");
		int a=sc.nextInt();

		        System.out.println("enter second number:");
		int b=sc.nextInt();

		        System.out.println("enter third number:");
		int c=sc.nextInt();*/
		
		int a=100,b=200,c=300;

		//1st method

		if(a>b && a>c) {
		System.out.println(a+"  is largest number");
		}
		if(b>a && b>c) 
		{
		System.out.println(b+"  is largest number");
		}
		else if(c>a && c>b)
		{
		System.out.println(c+"  is greatest number");
		}

		
	}

}
