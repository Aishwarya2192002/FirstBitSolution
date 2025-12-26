
public class AdmissionFormFields
{

	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	public AdmissionFormFields(String studentName, int age, double percentage, double courseFees, double feesPaid) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	public void validForm() throws EmptyNameException,UnderageException,InvalidPercentageException,NotFitForAdmissionException,FeesNotPaidException,InsufficientFeesException
   {
	     if(studentName ==null || studentName.isEmpty())
	     {
	    	 throw new EmptyNameException();
	     }
	     if(age<17)
	     {
	    	 throw new UnderageException();
	     }
	     if(percentage < 0 || percentage > 100)
	     {
	    	 throw new InvalidPercentageException();
	     }
	     if( percentage < 35)
	     {
	    	 throw new NotFitForAdmissionException();
	     }
	     if(feesPaid ==0)
	     {
	    	 throw new FeesNotPaidException();
	     }
	     if(feesPaid < courseFees)
	     {
	    	 throw new InsufficientFeesException();
	     }
   }
}
class Test
{
	public static void main(String[] args) {
		
	
	AdmissionFormFields a=new AdmissionFormFields("aishwarya", 22,  97, 299999, 300000);
	try
	{
		a.validForm();
		System.out.println("Admission Sucessfully....");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
