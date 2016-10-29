package javatpoint;

public class ContinueLoop {
	
	public void sigleloop(){
		for(int i=0;i<10;i++){
			
			if(i==5){
				continue;
				
			}
			System.out.println(i);
		}
	}
	
	public void Innerloop(){
		System.out.println("Innerloop");
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
			if((i==5)&&(j==5)){
				continue;
			}
			System.out.println(i+ " "+j);
			}
		}
	}
	
	public static void main(String[] args){
		ContinueLoop bl = new ContinueLoop();
		bl.sigleloop();
		bl.Innerloop();
	}


}
