package day30Challenge;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5Loop {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = 0;
	        for (int i=1;i<=10;i++)
	            {
	            k = n*i;
	            System.out.println(n+" x "+i+" = "+k);
	        }
	    }
	}

