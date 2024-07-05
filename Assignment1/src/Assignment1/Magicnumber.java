package Assignment1;
import java.util.Scanner;

//  Magic number:-
// (199)->1+9+9->(19)->1+9->(10)->1+0->(1) is a magic number.
// (99)->9+9->(18)->1+8->(9) is not a magic number.

public class Magicnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int number=sc.nextInt();
		
		magicNum(number);   
	}                         

	public static void magicNum(int number) {
		
		int temp=number;
		int sum=0;
		
		while(number>0 || sum>9)
		{
			if(number==0)
			{
				number=sum;
				sum=0;
			}
			else
			{
				sum=sum+number%10;
				number=number/10;
			}
		}
		
		if(sum==1)
		{
			System.out.println("Number is an magic number :"+temp);
		}
		else
		{
			System.out.println("Number is not a maggic number :"+temp);
		}
		
	}
}
