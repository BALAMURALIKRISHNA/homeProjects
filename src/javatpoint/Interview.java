package javatpoint;

import java.util.Scanner;
//import com.google.common.collect.Multiset.*;


public class Interview {
	

public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        Multiset<Character> s = HashMultiset.create();
//        Multi
//        int i;
//        for(i=0;i<str.length();i++){
//          s.add(str.charAt(i));
//                 
//        }System.out.println(s);
	
	System.out.println(reverse());
}


public static String reverse(){

Scanner sc = new Scanner(System.in);
     String str = sc.next();
     int len = str.length();
     StringBuilder op = new StringBuilder(len);
     for(int i=str.length()-1;i>=0;i--){
           op.append(str.charAt(i));
     
     }return op.toString();
     


}

}
