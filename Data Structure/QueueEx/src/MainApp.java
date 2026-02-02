import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size:");
		int size=sc.nextInt();
		MyQueue q=new MyQueue(size);
		
		while(true)
		{
			System.out.println("--- Hospital Appointment Menu --- ");
			System.out.println("1. Add Patient: ");
			System.out.println("2. Call Next Patient:");
			System.out.println("3. Display Waiting List ");
			System.out.println("4.Exit");
			
			System.out.println("Enter a choice:");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Patient Name:");
				String name=sc.next();
				q.enqueue(name);
				break;
				
			case 2:
				q.dequeue();
				break;
				
			case 3:
				q.displayQueue();
				break;
				
			case 4:
				System.out.println("------------------Exit-------------------");
				break;
			default:
				System.out.println("Invalid Choice");
			}
			
		}
	}
}
