package maths_related;

import java.util.Scanner;

public class Factorial_Recursion {
	
	public static long factorial(long x) {
		if (x == 1) {
			return x;
		}
		else {
			return x * factorial(x-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any positive integer other than ZERO: ");
		
		long num = input.nextLong();
		
		input.close();
		
		long fact = factorial(num);
		
		System.out.println("The factorial of integer " + num + " is " + fact + ".");
	}

}