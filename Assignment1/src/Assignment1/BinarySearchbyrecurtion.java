package Assignment1;

import java.util.Scanner;

public class BinarySearchbyrecurtion 
{
	public int binarySearch(int[] arr, int left, int right, int key) 
	{
		while(left<=right)
		{
		int mid=(left+right)/2;
		if(key==arr[mid])
		{
			return mid;
		}
		if(key<arr[mid])
		{
			return binarySearch(arr,left,mid-1,key);
		}
		else
		{
			return binarySearch(arr,mid+1,right,key);
		}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{	
		BinarySearchbyrecurtion bs=new BinarySearchbyrecurtion();
		int arr[]= {4,7,10,15,18,21,25,45,55};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to search in an array");
		int key=sc.nextInt();
		int n=arr.length-1;
		//---------------------(arr,left,right,search_key);
		int res=bs.binarySearch(arr,0,n,key);
		if(res==-1)
		{
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element fount at index "+res);
		}
	}
}
