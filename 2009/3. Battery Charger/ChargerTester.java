
public class ChargerTester {

	public static void main(String[] args) {

		int[] rates = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4,
				       4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1};
		
		System.out.println(rates.length);
		
		BatteryCharger charger = new BatteryCharger(rates);
		
		System.out.println( charger.getChargingCost(20, 9) );
		System.out.println( charger.getChargeStartTime(8) );
	}

}
