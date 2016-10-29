package javatpoint;

public class Variable {
	
	int k ; // instance or dynamic variable
	static int j =10; // static or class variable
	
	public void vari(int c)
	{
		int i  =c ; //local
		System.out.println(i);
	}

	
	public static void main(String args[])
	{
		Variable vari = new Variable();
		vari.k = 19;
		vari.vari(Variable.j *vari.k );;
	    
	}
}
