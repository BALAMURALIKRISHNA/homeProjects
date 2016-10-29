package javatpoint;

import java.util.ArrayList;

public class TypesOfForLoop {
	
	public static void main(String[] args){
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("e");
		ls.add("a");
		
		for(String i:ls){
			System.out.println(i);
			
		}
		
//		for(;;)
//		{  
//	        System.out.println("infinitive loop");  
//	    }  
		
	}

}
