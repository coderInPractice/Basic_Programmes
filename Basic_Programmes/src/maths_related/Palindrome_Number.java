package maths_related;

import java.util.*;
public class Palindrome_Number {
	static void toCheckPalindrome(int num) {
		int revNum=0;
		int n=num;
		int rem;
		while(n>0) {
			rem = n%10;
			revNum = revNum*10+ rem;
			n/=10;
		}
		if(num==revNum)
			System.out.println("Number is palindrome.");
		else
			System.out.println("Number is not palindrome.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number:");
		int num1= input.nextInt();
		input.close();
		toCheckPalindrome(num1);
		
		

	}

}