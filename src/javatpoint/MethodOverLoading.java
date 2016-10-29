package javatpoint;

public class MethodOverLoading {
	
	public void m1(){
		System.out.println("m1");
	}
	public int m1(int i, String k){
		int j =i;
		System.out.println("m2");
		return i;
	}
	
	public int m1(String k,int i){
		int j =i;
		System.out.println("m2");
		return i;
	}
	
	public double m1(double k,double i){
		double j =i;
		System.out.println("m2");
		return i;
	}

	
	/*
	 * Argument lists could differ in –
1. Number of parameters.
2. Data type of parameters.
3. Sequence of Data type of parameters.

*/
	 

}
