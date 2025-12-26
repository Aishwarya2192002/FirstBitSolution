import java.util.Scanner;
public class MovieBooking {
	
	
	static int Ticketprice=200;
	static int maxAvailableTickets=50;
	
	
	 void bookTickets(int noOfTickets)throws InvalidTicketNumberException,TicketsSoldOutException
	{
		if(noOfTickets<=0)
		{
			
				throw new InvalidTicketNumberException();
			
			
			
		}
		if(noOfTickets >maxAvailableTickets)
		{
			
				throw new TicketsSoldOutException();
			
				
		}
		int totalAmount=noOfTickets*Ticketprice;
		 maxAvailableTickets=maxAvailableTickets-noOfTickets;
		 
		 System.out.println("Booking Successful");
		 System.out.println("Tickets booked: "+noOfTickets);
		 System.out.println("Total amount:"+totalAmount);
	}
	static int getRemainingTickets()
	{
		return maxAvailableTickets;
	}

}


class MovieBookingApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MovieBooking booking = new MovieBooking();

        // MENU LOOP
        while (MovieBooking.getRemainingTickets() > 0)
        {
            System.out.println("Movie: 3 Idiots");
            System.out.println("Enter number of tickets:");

            int tickets = sc.nextInt();

            try
            {
                booking.bookTickets(tickets);
            }
            catch (InvalidTicketNumberException e)
            {
                System.out.println(e.getMessage());
            }
            catch (TicketsSoldOutException e)
            {
                System.out.println(e.getMessage());
            }
        }

        // Sold out message
        System.out.println("Tickets are sold out.");
        sc.close();
    }
}
