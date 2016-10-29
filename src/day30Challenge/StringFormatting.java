package day30Challenge;

import java.util.Scanner;

public class StringFormatting {


	    public static void main(String[] args) {
	    	String format ="";
	    	 Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++){
	                String s1=sc.next();
	                int x=sc.nextInt();
	                if (x<100)
	                    {
	                     format = String.format("%03d", x);
	                }else{
	                	format  = String.format("%3d", x); 
	                }
	                 System.out.printf("%-14s %s\n", s1, format);
	               
	               
	            }
	            System.out.println("================================");

	    }
	

}
