package javatpoint;

public class UseStatic {
	
	static int count=0;//will get memory only once and retain its value  
	 int t=0;
	  
	 static void UseStatic(){  
	count++; 
	//t++;
	//System.out.println(count +" "+t);  
	
	}  
	
	void sseStatic(){  
	count++; 
	t++;
	System.out.println(count +" "+t); 
	 UseStatic();
	} 
	
	public static void main(String args[]){  
	  
		UseStatic c1=new UseStatic();  
		UseStatic c2=new UseStatic();  
		UseStatic c3=new UseStatic();  
		c1.sseStatic();
		
	  
	 }  

}
