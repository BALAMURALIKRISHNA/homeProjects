package day30Challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Day10BinaryNumber {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reminder = 0;
        int c=0,ct=0,k=0,maxCt=0;
        Object[] a;
        ArrayList<Integer> al=new ArrayList<Integer>();  
        while(n>0)
        {
        	
        	//11001111
        	//101
        	reminder = n%2;
        	n=n/2;
        	if(reminder==1)
        	{	
        		ct=ct+1;
        		
        		//maxCt=ct;
        	}
        	else 
        	{
        		
        		//maxCt=ct>maxCt?ct:maxCt;
        		if(ct>maxCt)
        		{
        			maxCt=ct;
        		}
        		ct=0;
        	}
        	//al.add(reminder);
        	
        }
        if(ct>maxCt)
        	maxCt=ct;
        System.out.print(maxCt);
        System.out.print(ct);
//        Iterator itr=al.iterator();  
//        while(itr.hasNext()){  
//         System.out.print(itr.next());  
//         a = al.toArray();
//        	for(int i =1; i<=a.length;i++)
//        	{
//        		
//        		if(a[i].toString().equals("1"))
//                {
//               	 c= c++;
//               	k=c;
//                }
//        		else{
//        			k=c;
//        			c=0;
//        			//break;
//        			
//        		}
//        		
//        	}
//         }
//        System.out.println(k);  
        } 
    }


