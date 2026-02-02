
public class MyQueue {

	String arr[];
	int size;
	int front;
	int rear;
	
	MyQueue(int size)
	{
		this.size=size;
		arr=new String[size];
		front=-1;
		rear=-1;
	}
    boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		return false;
	}
	boolean isFull()
	{
		if((front==0 && rear==arr.length-1)||(front==rear+1))
		{
			return true;
		}
		return false;
	}
	void enqueue(String name)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return;
		}
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(rear==arr.length-1)
		{
			rear=0;
		}
		else
		{
			rear++;
		}
		arr[rear]=name;
	}
	void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Calling Next Patient:"+arr[front]);
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(front==arr.length-1)
		{
			front=0;
		}
		else
		{
			front++;
		}
	}
	void displayQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		int i=front;
		while(true)
		{
			System.out.println(arr[i]);
			if(i==rear)
			{
				break;
			}
			if(i==arr.length-1)
			{
				i=0;
			}
			else
			{
				i++;
			}
		}
	}
}
