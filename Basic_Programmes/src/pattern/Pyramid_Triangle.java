package pattern;

import java.util.Scanner;

public class Pyramid_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want:");
		
		int rows = input.nextInt();
		
		input.close();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<= (2*rows)-1;j++) {
				if(j >= rows-(i-1) && j <= rows+(i-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
