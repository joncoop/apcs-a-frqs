public class SingleTable
{
	private int numSeats;
	private int height;
	private double quality;
	
	public SingleTable(int numSeats, int height, double quality)
	{
		this.numSeats = numSeats;
		this.height = height;
		this.quality = quality;
	}
	
   public int getNumSeats()
   {
   	return numSeats;
   }
   
   public int getHeight()
   {
   	return height;
   }
   
   public double getViewQuality()
   {
   	return quality;
   }
   
   public void setViewQuality(double value)
   {
   	this.quality = value;
   }
}
