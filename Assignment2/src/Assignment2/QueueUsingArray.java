package Assignment2;

public class QueueUsingArray 
{
	int[] arr=new int[5];
	int size=0;
	int front=-1;
	int rear=-1;

	public int size()
	{
		return size;
	}
	
	void enqueue(int data)
	{
		if(rear==arr.length-1)
		{
			System.out.println("Queue is full");
			return;
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front=0;  // or front++;
				rear=0;   // or rear++;
			}
			else
			{
				rear++;
			}
			arr[rear]=data;
			size++;
			System.out.println("element "+data+" added to the queue");
		}
	}
	
	void dequeue()
	{
		if(front==-1 || front>rear)
		{
			System.out.println("Queue empty");
			return;
		}
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			int item=arr[front];
			front++;
			size--;
			System.out.println("Element "+item+" is dequeue");
		}
	}
	
	public void Display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		QueueUsingArray qua=new QueueUsingArray();
		System.out.println("Queue size: "+qua.size());
		qua.enqueue(10);
		qua.enqueue(20);
		qua.enqueue(30);
		qua.enqueue(40);
		qua.enqueue(50);
		
		System.out.println("After Enqueue:-");
		qua.Display();
		System.out.println("Queue size: "+qua.size());
		
		System.out.println("After Dequeue:-");
		qua.dequeue();
		
		System.out.println("Queue size: "+qua.size());
	}
}
