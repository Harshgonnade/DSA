package Assignment1;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number or string to cheak Anagram or not ");
		num1=sc.next();   // num1=12345
		num2=sc.next();   // num2=52431
		
		num1=num1.toLowerCase();
		num2=num2.toLowerCase();
		
		char[] arr1=num1.toCharArray();   // {1,2,3,4,5}
		char[] arr2=num2.toCharArray();   // {5,2,4,3,1}
		
		if(arr1.length==arr2.length)      
		{
			Arrays.sort(arr1);            // {1,2,3,4,5}
			Arrays.sort(arr2);            // {1,2,3,4,5}
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("The given number is anagram.");
			}
			else
			{
				System.out.println("The given number is not anagram.");
			}
			
		}
	}
}
