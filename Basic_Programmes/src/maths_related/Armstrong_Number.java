package maths_related;

import java.util.Scanner;

public class Armstrong_Number {
	static void checkArm(int x) {
		int rem ;
		int n = x;
		int c=0;
		while (n>0) {
			rem = n%10;
			
			c = c+(rem*rem*rem);
			
			n = n/10;
		}
		if (c==x) {
			System.out.println("It is Armstrong Number.");
		}
		else {
			System.out.println("It is not an Armstrong Number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		input.close();
		checkArm(num);
		
	}

}