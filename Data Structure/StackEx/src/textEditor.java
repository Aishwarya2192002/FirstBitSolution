import java.util.Stack;

public class textEditor {

	Stack<String>stack=new Stack<String>();
	
	void write(String Line)
	{
		stack.push(Line);
		System.out.println("Text is added");
	}
	void undo()
	{
		if(stack.isEmpty())
		{
			System.out.println("Nothing to undo");
		}
		else
		{
			System.out.println("Removed:"+stack.pop());
		}
	}
	void display()
	{
		if(stack.isEmpty())
		{
			System.out.println("Nothing to undo");
		}
		else
		{
		 System.out.println("Display Current text");
		 for(String Line:stack )
		 {
			 System.out.println(Line);
		 }
		}
	}
}
