package javatpoint;

public class CopyConstructor {
	
	int a,b;
	
  CopyConstructor(int c, int k){
		 a =c;
		 b = k;
		System.out.println("obj1 "+a +" "+b);
	}
  CopyConstructor(CopyConstructor e){
	   a =e.a;
	   b = e.b;
	  System.out.println("obj2 "+a +" "+b);
	}
  CopyConstructor(){
	  
	 
	 
	}
  
  void display()
  {
	  System.out.println("obj3 "+a +" "+b);
  }
  
  
  public static void main(String[] args){
	  CopyConstructor obj = new CopyConstructor(5,6);
	  CopyConstructor obj2 = new CopyConstructor(obj);
	  CopyConstructor obj3 = new CopyConstructor();
	  obj3.a = obj.b;
	  obj3.b = obj2.a;
	  obj3.display();
  }

}
