package javatpoint;

public class ContructorChaning {
	
	int id;
	String name;
	
	ContructorChaning (int id, String name)
	{
		this.id = id; //-------> using this for invoking instance variable
		this.name = name;
				
	}
	
	ContructorChaning(){
		this(5,  "thoma");//--> using this for invoking another constructor// this should be first line
		System.out.println(id+" "+name);
		
	}
	
	void n(){
		System.out.println("Hello ravana");
		//m();// compiler will automatially convert this to this.m();
	}
	
	void m(){
		this.n();//using this for invoking another method // can be any line in the code
		System.out.println("Rama  here");
		this.thisAsanArgument(this);
		
	}
	
	void thisAsanArgument(ContructorChaning s)
	{
		System.out.println(this);
		System.out.println("thisAsanArgument  here");
	}
	
	public static void main(String[] args)
	{
		ContructorChaning cc= new ContructorChaning();
		ContructorChaning cc2= new ContructorChaning();
		ContructorChaning cc3= new ContructorChaning();
		cc.m();
		System.out.println("cc"+" "+cc);
		System.out.println("cc2"+" "+cc2);
		System.out.println("cc3"+" "+cc3);
		cc3.thisAsanArgument(cc2);
	}

}
