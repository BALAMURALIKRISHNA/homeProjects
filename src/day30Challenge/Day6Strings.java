package day30Challenge;

import java.util.Scanner;

public class Day6Strings {
	
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
		        int t = in.nextInt();
		        in.nextLine();
	            
	            
	            int x=0;
	        for (int i=1;i<=t;i++)
	            {
	        	String str,kodd = "" ,keven = "" ; 
	            str = in.nextLine();
	            char[] char1 = str.toCharArray();
	            x= char1.length;
	            for(int j =0;j<=x-1;j++)
	                {
	                if(j%2==0)
	                    {
	                	kodd =kodd+char1[j];
	                }else {
	                	keven =keven+char1[j];  
	                }
	                        
	            }
	            System.out.println(kodd+" "+keven);
	            }
	        
	       
	        
	    }

	

}
