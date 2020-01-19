package maths_related;

import java.util.*;
public class Factorial_Without_Recusion {
	static void factorialCal(long num) {
		long fact=1;
		if (num==0 || num==1)
			System.out.println("Same as entered.");
		for (int i=1; i<=num; i++) {
			fact= fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		long i = input.nextLong();
		factorialCal(i);
		while (i>0) {
			System.out.println("Enter the number or 0 for exit");
			i= input.nextLong();
		if (i==0)
			break;
		else
			factorialCal(i);
		
		}
		input.close();

	}

}