package introcs.cs.princeton.edu;

import java.util.Scanner;

public class Quadratic {
	/*
	 * ax2+bx+c
	 * 
	 */
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values for a,b,c,x");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		
		int result =0;
		
		result = a*((int) Math.pow(x, 2)) + (b*x)+c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(Math.pow(x, 2));
		System.out.println(result);
		
	}
	

}
