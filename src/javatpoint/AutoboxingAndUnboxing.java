package javatpoint;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {
	
	public static void main(String[] args)
	{
	//	ArrayList<int> intArrayList = new ArrayList<int>();  ---> this will throw error u new use a wrapper class to get rid of this
	// Converting primitive type to wrapper is called Autoboxing and vice-versa is called Unboxing
		double x = 0.5;
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		ArrayList<Double> doubleArray = new ArrayList<Double>();
		
		for(int i=0; i<=10; i++){
			intArray.add(i);// autoboxing internally compiler runs intArray.add(Integer.valueOf(i));
			doubleArray.add(x);// autoboxing internally compiler runs intArray.add(Double.valueOf(i));
			x= x+0.5;
			 
		}
		
		for(int i=0; i<=10; i++){
			System.out.println("int " +intArray.get(i).intValue());// unboxing but intArray.get(i) will aslo work
			System.out.println("double " + doubleArray.get(i).doubleValue());// unboxing but intArray.get(i) will aslo work
		
	 
		}
		
		
	}

}
