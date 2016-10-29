package javatpoint;

import java.util.ArrayList;
import java.util.List;

public class ChallengeInterfaceClass2 implements Ichallenge1{

	@Override
	public ArrayList<String> setValues() {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<String>();
		str.add("PcMan");
		str.add("gcMan");
		str.add("ycMan");
		str.add("kcMan");
		str.add("NoMan");
		return (ArrayList<String>) str;
		
	}


	@Override
	public void getValues(ArrayList<String> str) {
		// TODO Auto-generated method stub
		for(String st : str)
		{
			System.out.println(st);
		}
	}
	
	
	
}
