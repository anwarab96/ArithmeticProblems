package com.arithmeticproblems;

public class FindingAbsoluteValue {

	public static void main(String[] args) {
		boolean equal = false;
		int i = 15;
		int j= - 25;
		System.out.println("Absolute value of " + i + " is : " + Math.abs(i));
		System.out.println("Absolute value of " + j + " is : " + Math.abs(j));
		if (Math.abs(i)==Math.abs(j)){
			System.out.println("Result is " + true);
		}else{
			System.out.println("Result is " + equal);
		}
		float f1 = 1.40f;
		float f2 = -5.28f;
		System.out.println("Absolute value of " + f1 + " is : " + Math.abs(f1));
		System.out.println("Absolute value of " + f2 + " is : " + Math.abs(f2));
		if (Math.abs(f1)==Math.abs(f2)){
			System.out.println("Result is " + true);
		}else{
			System.out.println("Result is " + equal);
		}
		double d1 = 3.324;
		double d2 = -3.324;
		System.out.println("Absolute value of " + d1 + " is : " + Math.abs(d1));
		System.out.println("Absolute value of " + d2 + " is : " + Math.abs(d2));
		if (Math.abs(d1)==Math.abs(d2)){
			System.out.println("Result is " + true);
		}else{
			System.out.println("Result is " + equal);
		}
		long l1= 5l;
		long l2= -5l;
		System.out.println("Absolute value of " + l1 + " is : " + Math.abs(l1));
		System.out.println("Absolute value of " + l2 + " is : " + Math.abs(l2));
		if (Math.abs(l1)==Math.abs(l2)){
			System.out.println("Result is " + true);
		}else{
			System.out.println("Result is " + equal);
		}
		
	}

}
