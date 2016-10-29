package introcs.cs.princeton.edu;

import java.util.Random;

public class RamdomNumber {
	
	public static void main(String[] args)
	{
		double s = (Math.random()*1000.00);
		
		System.out.println(String.format("%.2f", s));
		Random rn = new Random();
		System.out.println(Math.abs(rn.nextInt()));
		
		double k = Math.random();
		System.out.println(k);
		if(k<0.5){
			System.out.println("heads");
		}else if(k>0.5){
			System.out.println("tails");
		}
		int i=1;
		while(i<=10){
			System.out.println(Math.pow(i, 2));
			i++;
		}
		
		System.out.println("Here is Harmonic numbers 1+1/1+1/2+1/3");
		
		int j=1;
		double m=0;
		while(j<=1000){
			
			m = m+ 1.0/j;
			j++;
			
			
		}
		System.out.println("result="+m);
		
	
		System.out.println("Here is the Square root"+Math.sqrt(m));
		
		
		
		
		
	}

}
