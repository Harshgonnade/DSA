package Assignment1;

import java.util.Scanner;

public class BinarySearchbyiteration 
{

	public static int binarySearch(int[] arr, int l, int h, int key) {
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]>key)
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			
//			or
			
//			if(arr[mid]==key)
//			{
//				return mid;
//			}
//			else if(arr[mid]<key)
//			{
//				l=mid+1;
//			}
//			else
//			{
//				h=mid-1;
//			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {5,6,9,13,24,56,78};
		Scanner sc=new Scanner(System.in);
		int key;
		System.out.println("Enter number to search");
		key=sc.nextInt();
		int n=arr.length;
		int res;
		res=binarySearch(arr,0,n-1,key);
		
		if(res==-1)
		{
			System.out.println("Element not found.");

		}
		else
		{
			System.out.println("Element found.");
		}
	}
}
