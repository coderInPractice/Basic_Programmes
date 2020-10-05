package pattern;

import java.util.Scanner;

//Enter the number of rows:
//5
// *  *  *  *  * 
// *  *  *  * 
// *  *  * 
// *  * 
// * 

public class Inverse_Right_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		
		int rows = input.nextInt();
		
		input.close();
		
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
