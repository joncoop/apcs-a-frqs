
public class Vehicle extends TaxableItem {

	public double dealerCost;
	public double dealerMarkup;
	
	public Vehicle(double taxRate, double dealerCost, double dealerMarkup) {
		super(taxRate);
		
		this.dealerCost = dealerCost;
		this.dealerMarkup = dealerMarkup;
	}

	public double getListPrice() {
		return dealerCost + dealerMarkup;
	}
	
	public void changeMarkup(double dealerMarkup) {
		this.dealerMarkup = dealerMarkup;
	}

}
