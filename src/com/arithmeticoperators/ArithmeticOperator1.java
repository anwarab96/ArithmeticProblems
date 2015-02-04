package com.arithmeticoperators;

import java.util.Scanner;

public class ArithmeticOperator1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum, diff, product, quotient = 0 ;
		System.out.println(" Enter the 1st number: ");
		int num1 = scan.nextInt();
		System.out.println(" Enter the 2nd number:  ");
		int num2 = scan.nextInt();
		int anum3 = num1 + num2;
		int snum4 = num1 - num2;
		int mnum5 = num1*num2;
		double dnum6 = num1/num2;
		int mod7 = num1%num2;
		System.out.println("Addition of num1 and num2 is " + anum3);
		System.out.println("Subtraction of num1 and num2 is " + snum4);
		System.out.println("Multiplication of num1 and num2 is " + mnum5);
		System.out.println("Division of num1 and num2 is " + dnum6);
		System.out.println("Modulus of num1 and num2 is " + mod7);
	}

}
