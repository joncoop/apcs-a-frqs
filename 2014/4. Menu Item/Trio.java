
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
		String n1 = sandwich.getName();
		String n2 = salad.getName();
		String n3 = drink.getName();
		
		return n1 + "/" + n2 + "/" + n3 + " Trio";
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
