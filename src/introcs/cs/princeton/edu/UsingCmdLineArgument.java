package introcs.cs.princeton.edu;



public class UsingCmdLineArgument {
	
	public static void main(String[] args){
		
		int len = args.length;
		
		int c,k;
		if(len>0)
		{
			 c= Integer.parseInt(args[0]);
			 k =Integer.parseInt(args[1]);
			System.out.println(len);
			System.out.println("c"+c);
			System.out.println("k"+k);
			
			System.out.println(c+k);	
		}else{
			System.out.println("error");
		}
		
		
		
		
	}


}
