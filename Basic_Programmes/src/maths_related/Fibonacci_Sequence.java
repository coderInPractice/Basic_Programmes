package maths_related;

import java.util.Scanner;

public class Fibonacci_Sequence {
	public static void fiboseries(int x,int y, int z) {
		int k = x;
		int next=0;
		int f1=y;
		int f2=z;
		for (int n=2; n<=k; n++) {
			next = f1+f2;
			System.out.print(","+(next));
			f1=f2; //Feedback
			f2=next; //Feedback
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0;
		int f2=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci Terms: ");
		int num = input.nextInt();
		input.close();
		System.out.print((f1)+","+(f2));
		fiboseries(num,f1,f2);
		
		
	}

}