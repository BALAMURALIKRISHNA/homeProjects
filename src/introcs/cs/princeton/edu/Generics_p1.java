package introcs.cs.princeton.edu;

import java.util.ArrayList;

public class Generics_p1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(3);
		
		printArray(ar);
		
	}
	
	private static void printArray(ArrayList<Integer> ar)
	{
		for(Integer obj : ar){
			
			System.out.println((int)obj*2);
		}
	}
}
