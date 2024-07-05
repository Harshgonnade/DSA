package Assignment1;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D array :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		
		System.out.println("Enter the value of array :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("2D Array :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
