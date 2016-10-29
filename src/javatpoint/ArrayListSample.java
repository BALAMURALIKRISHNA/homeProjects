package javatpoint;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListSample {
	
	public ArrayList<String> setValues(int a, String pass){
		System.out.println("======setValues=====");
		ArrayList<String> ar = new ArrayList<String>();
		Random rn = new Random();
		for(int i=0;i<a;i++){
		ar.add(rn.nextInt(100)+pass);
		}
		
		return ar;
	}
	
	public void getValues(ArrayList<String> ar){
		System.out.println("=====getValues======");
		for (String str : ar) {
			System.out.println(str);
		}
	}
	
	public void searchValues(ArrayList<String> ar,String str){
		System.out.println("=====SearchValues======");
		ar.contains(str);
		
	}
	
	public void modifyValues(ArrayList<String> ar,String replacestr){
		System.out.println("=====ModifyValues======");
		ar.set(3, replacestr);
		getValues(ar);
	}
	
	public static void main(String[] args)
	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter new size of arrayList");
		int k = scan.nextInt();
		System.out.println("Enter new String arrayList");
		String str = scan.next();
		System.out.println("Enter new String to Modify arrayList");
		String replacestr = scan.next();
		ArrayListSample obj = new ArrayListSample();
		
		obj.getValues(obj.setValues(k, str));
		obj.modifyValues(obj.setValues(k, str),replacestr);
		
		
		
		
	}

}
