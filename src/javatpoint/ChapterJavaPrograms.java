package javatpoint;

public class ChapterJavaPrograms {
	
	static 	int l1 = 0,l2=1, l3=0;
	public void fibonacciseries(int limit)
	{
		int n1 = 0,n2=1, n3;
		System.out.print(n1+","+n2);		
			
		for (int i=0; i<=(limit-2); i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			
			System.out.print(","+n3);
		}
	}
	
	public void fibonacciseriesViaRecurring(int limit)
	{		
		if(limit>0){
			l3=l1+l2;
			l1=l2;
			l2=l3;
			System.out.print(","+l3);
			fibonacciseriesViaRecurring(limit-1);
		}
		
	}
	
	public static void main(String[] args){
		ChapterJavaPrograms fs = new ChapterJavaPrograms();
		System.out.print("======I am a part of normal function=======");
		fs.fibonacciseries(10);
		System.out.println("======I am a part of recurring=======");

		System.out.print(l1+","+l2);
		fs.fibonacciseriesViaRecurring(10);
	}

}
