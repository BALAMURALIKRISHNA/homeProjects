package day30Challenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3IntroToConditionalStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			
//			if((n>=2)||(n<=5))
//			{
//				ans = "Not Weird";
//			}
//			else if((n>=6)||(n<=19)){
//				
//				ans = "Weird";
//			}
//			else if(n>=20){
//				
//				ans = "Not Weird";
//			}
//			
//			else {
//				ans = "Weird";
//			}
			
			 if((n>=6)&&(n<=20)){		
			  ans = "Weird";
			}
			 else{
				 
				 ans = "Not Weird";
				 
			 }
			
		}
		System.out.println(ans);
	}
}




//Task 
//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of 2 to 5, print Not Weird
//If  is even and in the inclusive range of  6 to 20, print Weird
//If  is even and greater than 20, print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//
//Input Format
//
//A single line containing a positive integer, .
//
//Constraints
//1<=n<=100
//
//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.
