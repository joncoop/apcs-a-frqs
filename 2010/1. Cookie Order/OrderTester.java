
public class OrderTester {

	public static void main(String[] args) {

		MasterOrder goodies = new MasterOrder();
		
		goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
		goodies.addOrder(new CookieOrder("Shortbread", 5));
		goodies.addOrder(new CookieOrder("Macaroon", 2));
		goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
		
		System.out.println(goodies);
		System.out.println("Total boxes = " + goodies.getTotalBoxes() + "\n");
		
		int removed = goodies.removeVariety("Chocolate Chip");
		System.out.println("Removed = " + removed);
		System.out.println(goodies);
		System.out.println("Total boxes = " + goodies.getTotalBoxes() + "\n");

		removed = goodies.removeVariety("Brownie");
		System.out.println("Removed = " + removed);
		System.out.println(goodies);

		System.out.println("Total boxes = " + goodies.getTotalBoxes());

	}

}
