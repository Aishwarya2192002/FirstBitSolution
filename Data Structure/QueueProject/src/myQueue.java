
public class myQueue {

	int []arr;
	int front;
	int rear;
	myQueue(int size)
	{
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	public boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if((front==0 && rear==arr.length-1)||(front==rear+1))
		{
			return true;
		}
	    return false;
		
	}
	void enqueue(int val)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
			return;
		}
		if(front==-1)
		{
			front =0;
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
		arr[rear]=val;
	}
	void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.println("Deleted Element is:"+arr[front]);
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
	void display()
	{
	    if(isEmpty())
	    {
	        System.out.println("Queue is Empty");
	        return;
	    }

	    int i = front;
	    while(true)
	    {
	        System.out.print(arr[i] + " ");

	        if(i == rear)
	            break;

	        i = (i + 1) % arr.length;
	    }
	    System.out.println();
	}

}
