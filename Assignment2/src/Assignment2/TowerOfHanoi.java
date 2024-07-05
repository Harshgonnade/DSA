package Assignment2;

import java.util.Scanner;

// que1
public class TowerOfHanoi 
{
	static int count=0;
	public static void towerofHanoi(int n,char src,char aux,char dest)
	{
		if(n==1)
		{
			
			System.out.println(src+"-->"+dest);
			count ++;
			return;
		}
		towerofHanoi(n-1,src,dest,aux);
		towerofHanoi(1,src,aux,dest);
		towerofHanoi(n-1,aux,src,dest);
	}

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number of disk");
    	int n=sc.nextInt();
    	towerofHanoi(n,'A','B','C');
    	System.out.println("Number of moves is "+count);
    }
}
