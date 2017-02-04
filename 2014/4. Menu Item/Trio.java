
public class Trio implements MenuItem {

	private Sandwich sandwich;
	private Salad salad; 
	private Drink drink;
	
	public Trio(Sandwich sandwich, Salad salad, Drink drink) {
		this.sandwich = sandwich;
		this.salad = salad;
		this.drink = drink;
	}
	
	public String getName() {
		return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
	}

	public double getPrice() {
		
		double p1 = sandwich.getPrice();
		double p2 = salad.getPrice();
		double p3 = drink.getPrice();
		
		double total = p1 + p2 + p3;
		double lowest = Math.min(p1, Math.min(p2, p3));
		
		return total - lowest;
	}

}
