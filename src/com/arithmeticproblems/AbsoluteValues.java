package com.arithmeticproblems;

import java.util.Scanner;

public class AbsoluteValues {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean equal = false;
		//get ist number from users
		System.out.println("Enter the 1st number: ");
		 int num1 = scan.nextInt();
		 System.out.println("Absolute value of " + num1 + " is : "+ Math.abs(num1));
		//get 2nd number from users
		 System.out.println("Enter the 2nd number: "); 
		 int num2 = scan.nextInt();
		 System.out.println("Absolute value of " + num2 + " is : "+ Math.abs(num2));
		 if(Math.abs(num1) == Math.abs(num2)){
			 System.out.println("Result is : "+ true);
		 } else{
			 System.out.println("The Result is "+ equal);
		 }
		 //print absolute value for (1-100)
		 System.out.println(" ");
		 System.out.println("The absolute value of (1-100) is " + Math.abs(1-100));
		
	}

}
