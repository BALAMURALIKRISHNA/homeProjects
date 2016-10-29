package day30Challenge;

	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	public class Day2Challenge {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	      
	        // Write your calculation code here.
	        double tipPercent1= (double)(tipPercent/100.0f) * mealCost;
	        System.out.println(tipPercent1);
	        double taxPercent2= (double)(taxPercent/100.0f)*mealCost;
	        System.out.println(taxPercent2);
	        double total = mealCost  + tipPercent1  + taxPercent2;
	        System.out.println(total);
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(total);
	      
	        // Print your result
	        System.out.println("The total meal cost is "+totalCost+" dollars ");
	    }
	}


