public class Advance extends Ticket
{
    private int days;
    
    public Advance(int days)
    {
        //super();
        this.days = days;
    }
    
    public double getPrice()
    {
        if (days  < 10)
    		return 40.00;
    	else
    		return 30.00;
    }
}