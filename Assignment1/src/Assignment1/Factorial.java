package Assignment1;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("by iteration: "+ factorialbyiteration(5));
		System.out.println("by recursion: "+ factorialbyrecursion(5));
	}
	
	// By using iteration
	public static int factorialbyiteration(int n) {
		int temp = 1;
		for(int i=n; i>0; i--) {
			temp = temp * i;
		}
		return temp;
	}
	
	// By using recursion 
	public static int factorialbyrecursion(int n) {
		if(n==0 || n==1)
			return 1;
		return n*factorialbyrecursion(n-1);
	}
}
