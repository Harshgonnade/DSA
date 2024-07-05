package Assignment2;

public class StackUsingList 
{
	static ListNode head;
	
	public class ListNode
	{
		int data;
		ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public void push(int data) 
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;			
	}

	public void pop()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
			return;
		}
		head=head.next;
		return;
	}
	
	public void peek()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Peek element: "+head.data);
	}
	
	public void display() 
	{
		System.out.println("Element of an stack: ");
		
		if(head==null)
		{
			System.out.println("Stack is empty");
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
		StackUsingList sul=new StackUsingList();
		sul.push(10);
		sul.push(20);
		sul.push(30);
		sul.push(40);
		sul.push(50);
		sul.display();
		
		System.out.println("After pop");
		sul.pop();
		sul.display();

		sul.peek();
	}
}
