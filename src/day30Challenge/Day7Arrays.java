package day30Challenge;

import java.util.Scanner;

public class Day7Arrays {
	

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	            //System.out.print(arr[i] +" ");
	        }
	        for(int j=n-1; j>=0; j--){
	            System.out.print(arr[j] +" ");
	        }
	        in.close();
	    }

}
