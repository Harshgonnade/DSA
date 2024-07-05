package Assignment2;

public class StackUsingArray 
{
	int top;
	int[] arr;
//	int capacity=5;
//	int[] arr=new int[capacity];
//	int top=-1;
	
	public StackUsingArray(int capacity)
	{
		top=-1;
		arr=new int[capacity];
	}
	
	public boolean isFull()
	{
//		return arr.length==capacity-1;
		return arr.length==size();
	}
	public int size()
	{
		return top+1;
	}
	public boolean isEmpty()
	{
//		return top<0;
		return top==-1;
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			throw new RuntimeException("Stack is full !!");
		}
//		top++;
//		arr[top]=data;
		arr[++top]=data;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack is empty !!");
		}
		int result=arr[top];
		top--;
		return result;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack is empty !!");
		}
		return arr[top];
	}
	
	public void display() 
	{
		System.out.println("Element of an stack: ");
		
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		StackUsingArray sua=new StackUsingArray(5);
		sua.push(10);
		sua.push(20);
		sua.push(30);
		sua.push(40);
		sua.push(12);
		sua.display();
		System.out.println();
		System.out.println("pop element is"+sua.pop());
		System.out.println();
		System.out.println("Peek element is "+sua.peek());
	}
	
}
