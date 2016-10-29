package javatpoint;

public class BreakLoop {
	
	public void sigleloop(){
		for(int i=0;i<10;i++){
			
			if(i==5){
				break;
			}
			System.out.println(i);
		}
	}
	
	public void Innerloop(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
			if((i==5)&&(j==5)){
				break;
			}
			System.out.println(i+ " "+j);
			}
		}
	}
	
	public static void main(String[] args){
		BreakLoop bl = new BreakLoop();
		bl.sigleloop();
		bl.Innerloop();
	}

}
