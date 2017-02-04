
public class MenuItemTester {

	public static void main(String[] args) {
		
		Sandwich burger = new Sandwich("Cheesburger", 2.75);
		Sandwich club = new Sandwich("Club Sandwich", 2.75);

		Salad spinach = new Salad("Spinach Salad", 1.25);
		Salad slaw = new Salad("Coleslaw", 1.25);

		Drink orange = new Drink("Orange Soda", 1.25);
		Drink cappuccino = new Drink("Cappuccino", 3.50);
		
		Trio trio1 = new Trio(burger, spinach, orange);
		Trio trio2 = new Trio(club, slaw, cappuccino);
		
		MenuItem[] trios = {trio1, trio2};
		
		for (MenuItem item: trios) {
			String name = item.getName();
			double price = item.getPrice();
			
			System.out.printf("%s - $%.2f%n", name, price);
		}
		
	}

}
