package javatpoint;

public class HelloWorld {
	
//	 static public void main(String[] args)
//	{
//		System.out.println("hello");
//	}
//	 
//	 public static void main(String[] args)  
//	 {
//		System.out.println("hello");
//	}
//	 public static void main(String []args)  
//	 {
//		System.out.println("hello");
//	}
//	 public static void main(String args[])  
//	 
//	 {
//		System.out.println("hello");
//	}
	 
	 public static void main(String... args)  
	 
	  {
		System.out.println("hello");
		
		System.out.println("Valid notations :-\n" +
				"public static void main(String[] args) \n" +
				"public static void main(String []args) \n" + 
				"public static void main(String args[])\n" +
				"public static void main(String... args)\n" + 
				"static public void main(String[] args)\n" +
				"public static final void main(String[] args)\n" +
				"final public static void main(String[] args)\n" + 
				"final strictfp public static void main(String[] args)");
	
	 
	 	System.out.println("InValid notations :-\n" +
				"public void main(String[] args)\n" +
				"static void main(String[] args)\n" + 
				"public void static main(String[] args)\n" + 
				"abstract public static void main(String[] args)");
	}
	 

};  //----> semicolon @ the end of the class is optional




 
