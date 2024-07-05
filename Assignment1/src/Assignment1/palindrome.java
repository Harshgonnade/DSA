package Assignment1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to cheak palindrom or not");
		int num=sc.nextInt();
		int temp=num;
		
		int rem=0,rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverse of number is "+ rev);
		
		if(temp==rev)
		{
			System.out.println("The given number is palindrome.");
		}
		else
		{
			System.out.println("The given number is not palindrom.");
		}
		
		
	}
}
