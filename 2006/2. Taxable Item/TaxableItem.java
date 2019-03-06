
public abstract class TaxableItem implements Item {

	private double taxRate;
	
	public TaxableItem(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public abstract double getListPrice();
	
	public double purchasePrice() {
		return getListPrice() * (1.00 + taxRate);
	}
}
