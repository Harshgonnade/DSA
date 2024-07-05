package Assignment1;


public class FibonaccibyTwoWays {

	public FibonaccibyTwoWays() {
		for(int i=0; i<this.arr.length; i++) {
			arr[i] = -1;
		}
	}
	
	public static void main(String[] args) {
//		int  num=5;
//		for(int i=0;i<num;i++)
//		{
//		System.out.println(fibonnaciByRecursion(i));
//		}
//		long timebeforecall = System.nanoTime();
//		System.out.println(fibonnaciByRecursion(5));
//		long timeaftercall = System.nanoTime();
//		System.out.println("time taken: "+(timeaftercall-timebeforecall));
		
		
		long timebeforecall = System.nanoTime();
		new FibonaccibyTwoWays();
		System.out.println(fibonnaciByMemoization(10));
		long timeaftercall = System.nanoTime();
		System.out.println("time taken: "+(timeaftercall-timebeforecall));
	}
	
	// Fibonnaci by using recursion
	
//	public static int fibonnaciByRecursion(int n) {
//		// termination condition
//		if(n==0 || n==1) {
//			return n;
//		}
//		else
//		{
//			return fibonnaciByRecursion(n-1)+fibonnaciByRecursion(n-2);
//		}
//	}
	
	// MEMOIZATION (Temporary storage - to cut down repeated recursive calls)
	
	public static long[] arr = new long[100];

	public static long fibonnaciByMemoization(long n) {
		long fib = 0;
		if(n==0 || n==1) { // termination condition
			return n;
		} else if(arr[(int)n]!=-1) {
			// this is true if the nth recursive has been executed sometime before
			return arr[(int)n];
		} else {
			// if the nth recursive call is not execute before this the next line if executed
			fib = fibonnaciByMemoization(n-1)+fibonnaciByMemoization(n-2);
			arr[(int)n] = fib;
			return fib;
		}
	}
}
