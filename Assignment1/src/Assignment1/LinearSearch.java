package Assignment1;

import java.util.Scanner;

public class LinearSearch {

	public static void search(int[] arr,int num)
	{
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(num +"  is present in the array.");
		}
		else
		{
			System.out.println(num+" is not present in the array.");
		}
	}
	public static void main(String[] args) {
		
		int[] arr= {10,38,25,62,55,49,54};
		System.out.println("Enter number to search in array :");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		search(arr,num);
	}
}
