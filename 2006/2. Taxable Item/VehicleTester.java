
public class VehicleTester {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle(0.10, 20000.00, 2500.00);
		
		System.out.println(v.getListPrice());
		System.out.println(v.purchacePrice());
		
		v.changeMarkup(1000.00);
		System.out.println(v.getListPrice());
		System.out.println(v.purchasePrice());
		
	}

}
