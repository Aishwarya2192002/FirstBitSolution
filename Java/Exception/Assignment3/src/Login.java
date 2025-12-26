import java.util.Scanner;

public class Login {
    String username="admin";
    String  password="1234";
    
    void validateUsername(String enteredUsername) throws InvalidUsernameException
    {
    	if(!enteredUsername.equals(username))
    	{
    		throw new InvalidUsernameException();
    	}
    }
    void validatePassword(String enteredPassword) throws InvalidPasswordException
    {
    	if(!enteredPassword.equals(password))
    	{
    		throw new InvalidPasswordException();
    	}
    }
}
class LoginApp
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Login l=new Login();
		System.out.println("Enter UserName:");
		String username=sc.nextLine();
		try
		{
			l.validateUsername(username);
		}
		catch(InvalidUsernameException e)
		{
			System.out.println(e);
			return;
		}
		
		
		int attempt =3;
		while(attempt>0)
		{
			System.out.println("Enter Password:");
			String passwords=sc.nextLine();
			
			
			try
			{
				l.validatePassword(passwords);
				System.out.println("Login Successful");
				return;
			}
			catch(InvalidPasswordException ie)
			{
				attempt--;
				if(attempt>0)
				{
					System.out.println(ie);
					System.out.println("Attempts remaining:"+attempt);
					
				}
				
			}
		}
		System.out.println("Account Locked!");
		
	}
}