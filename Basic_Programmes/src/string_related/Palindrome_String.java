package string_related;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any string:");
		
		String str = input.nextLine();
		
		input.close();
		
		String sec_str = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			sec_str = sec_str +str.charAt(i);
		}
		
		if(str.equals(sec_str)) {
			System.out.println("String is palindrome.");
		}
		else {
			System.out.println("String is not palindrome.");
		}

	}

}
