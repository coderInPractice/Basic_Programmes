package maths_related;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var;
		
		boolean isPrime = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		int num = input.nextInt();
		
		input.close();
		if((num < 0) || num == 0 || num == 1) {
			System.out.println("Enter positive integer >= 2.");
		}
		else {
			for(int i=2;i<=num/2;i++) {
				var = num%i;
				if(var == 0) {
					isPrime = false;
					break;
				}
				else {
					isPrime = true;
				}
			}
			
			if(isPrime) {
				System.out.println(num + " is prime.");
			}
			else {
				System.out.println(num + " is not prime.");
			}
		}
	}

}
