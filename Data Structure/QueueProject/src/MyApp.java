import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		myQueue m=new myQueue(3);
		int choice;
		do
		{
			System.out.println("1.Dequeue");
			System.out.println("2.Enqueue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Number:");
				int val=sc.nextInt();
				m.enqueue(val);
				break;
				
			case 2:
				m.dequeue();
				break;
			case 3:
				m.display();
				break;
			case 4:
				System.out.println("--------------Exit-------------");
				break;
			default:
				System.out.println("Invalid Choice");
			
			}
		}
		while(choice!=4);
		sc.close();
	}

}
