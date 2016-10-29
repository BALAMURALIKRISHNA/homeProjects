package javatpoint;

public class SwitchWithBreakAndWithoutBreak {
	
	public  void withBreak(int i)
	{
		switch(i)
		{
		case 10:
		{
			System.out.println("case 10:");
			break;
		}
		case 20:
		{
			System.out.println("case 20:");
			break;
		}
		case 30:
		{
			System.out.println("case 30:");
			break;
		}
		default:{
			System.out.println("Not anywhere");
		}
		
		}
		
	}
	
	public  void withOutBreak(int i)
	{
		
		switch(i)
		{
		case 1:
		{
			System.out.println("case 1:");
			
		}
		case 2:
		{
			System.out.println("case 2:");
			
		}
		case 3:
		{
			System.out.println("case 3:");
			
		}
		default:{
			System.out.println("Not anywhere");
		}
		
		}
		
	}
	
	public static void main(String[] arg)
	{
		SwitchWithBreakAndWithoutBreak sw = new SwitchWithBreakAndWithoutBreak();
		sw.withBreak(20);
		sw.withOutBreak(2);
	}

}
