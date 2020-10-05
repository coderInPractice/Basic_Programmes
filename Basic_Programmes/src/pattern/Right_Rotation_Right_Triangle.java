package pattern;

import java.util.Scanner;

public class Right_Rotation_Right_Triangle {
		/*
	 * Enter the nummber of rows: 6
		 *
		 **
		 ***
		 ****
		 *****
		 ******
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the nummber of rows:");
		
		int rows = input.nextInt();
		
		input.close();
		
		for(int i=1;i<=rows;i++) {
			for(int j=rows-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
