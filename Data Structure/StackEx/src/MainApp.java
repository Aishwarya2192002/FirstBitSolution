import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		textEditor edit=new textEditor();
		while(true)
		{
			System.out.println("1. Write a line :");
			System.out.println("2. Undo :");
			System.out.println("3. Display current text: ");
			System.out.println("4. Exit ");
			
			System.out.println("Enter a choice");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter line");
				String line=sc.nextLine();
				edit.write(line);
				break;
				
			case 2:
				edit.undo();
				break;
			case 3:
				edit.display();
				break;
			case 4:
				System.out.println("--------------Exit---------------");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
