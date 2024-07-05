package Assignment1;

import java.util.Scanner;

public class Fiboseries {

	static int num1=0,num2=1,num3;
    private static void fibo(int num) 
	{
    	if(num>0)       //(3>0);(2>0);(1>0);(0>0)->false
    	{
    		num3=num1+num2;  //->0+1=1; ->1+1=2; ->1+2=3
    		num1=num2;       //->1;     ->1;     ->2
    		num2=num3;       //->1;     ->2;     ->3
    		System.out.println(num3 + " ");
    		fibo(num-1);
    	}	
	}
    
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to print fibonacci series");
		int num=sc.nextInt();
		System.out.println("Fibonacci series :");
		System.out.println("0");
		System.out.println("1");
		fibo(num-2);
		System.out.println();
		System.out.println(num+"Fibo number is "+num3);
		sc.close();
		System.out.println();
		
//		 print fibonacci series by different way
		for(int i=0;i<num;i++) {
		System.out.println(fib(i));
		}
		
	}
	
	public static int fib(int n)
    {
    	if(n==1 || n==0)
    	{
    		return n;
    	}
    	else
    	{
    		return fib(n-1)+fib(n-2);
    	}
    }

	
		
}
