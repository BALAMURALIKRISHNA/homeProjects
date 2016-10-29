package day30Challenge;

/*
 * Desc :- Swap the number
 * Input a , b 
 * 
 * 
 * 
 * */

public class SwappingTheNumber {
		
	public void swapWithTemp(int a, int b)
	{
		System.out.println("swapWithTemp");	
		System.out.println("a="+a +"\t b="+b);
		int c=0;		
		c=a;
		a=b;
		b=c;
		System.out.println("I am done");
		System.out.println("a="+a +"\t b="+b);
		
	}
	
	public void swapWithOutTemp(int a, int b)
	{
		System.out.println("swapWithOutTemp");	
		System.out.println("a="+a +"\t b="+b);	
		a=a+b; // a= 2, b=3   5
		b=a-b; // 2
		a=a-b;
		System.out.println("I am done");
		System.out.println("a="+a +"\t b="+b);
		
	}
	
	public static void main(String[] args)
	{
		SwappingTheNumber st = new SwappingTheNumber();
		st.swapWithTemp(20, 25);
		st.swapWithOutTemp(2, 3);
	}

}
