package introcs.cs.princeton.edu;

import java.util.Scanner;

public class LeapOrNot {
	
	public static void main(String[] args)
	{
		
		
		int arr[] = {1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020};
		int year =0;
	
		for(int i = 0;i<=arr.length;i++)
		{
			
		 year = arr[i];
		
		 if(year%400==0)
		 {
			 System.out.println("leap year");
		 }else if(year%100==0)
		 {
			 System.out.println("not a leap year");
		 }else if(year%4==0)
		 {
			 System.out.println(" a leap year");
		 }else
		 {
			 System.out.println("not a leap year");
		 }
		}
		
	}
}
	    
	


