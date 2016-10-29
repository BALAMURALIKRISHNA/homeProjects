package day30Challenge;
/**
 * 
 * 
 * @author bkrishnankutty
 * Heron's formula
 * area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
 *
 */

public class TriangleAreaUsingCommandLineArgument {
	
	public static void main(String[] args)
	{
		int len =args.length;
		double s, a,b,c,area;
			
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
			
			s=a+b+c/2;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println(area);
		
		
	}

}
