package Assignment1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchReapetadeWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter paragraph");
		String para=sc.nextLine();
		
		System.out.println("Enter search element");
		String search=sc.next();
		String wordToSearch=search;
		
		Pattern pattern=Pattern.compile("\\b"+wordToSearch+"\\b");
		
		Matcher matcher=pattern.matcher(para);
		
		int count=0;
		
		while(matcher.find())
		{
			count++;
//			System.out.println("Found at index "+ matcher.start());
		}
		System.out.println("Total accurrences :"+count);
	}
}
