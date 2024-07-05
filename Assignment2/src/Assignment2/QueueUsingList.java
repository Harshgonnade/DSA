package Assignment2;

public class QueueUsingList 
{
	public ListNode head;
	
	public static class ListNode
	{
		int data;
		ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	void enqueue(int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
	}
	
	void dequeue()
	{
		if(head==null)
		{
			System.out.println("Queue is empty ");
			return;
		}
		head=head.next;
		return;
	}
	
	public void display() 
	{
		System.out.println("Element of an Queue: ");
		
		if(head==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		QueueUsingList qul=new QueueUsingList();
		qul.enqueue(10);
		qul.enqueue(20);
		qul.enqueue(30);
		qul.enqueue(40);
		qul.enqueue(50);
		System.out.println("After Enqueue");
		qul.display();
		System.out.println();
		System.out.println("After Dequeue");
		qul.dequeue();
		qul.display();
		
	}
}
