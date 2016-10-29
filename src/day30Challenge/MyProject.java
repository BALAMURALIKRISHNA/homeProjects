package day30Challenge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyProject {
	
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your time");
		String time1 = scan.next();
		System.out.println("Enter your Range");
		String range = scan.next();
			
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(range);
		Date date3;
		for(int i =1 ;i<=5; i++)
		{
			//date3 = date1.getTime() + date2.getTime() ;
			System.out.println(date1);
		}
	}

}
