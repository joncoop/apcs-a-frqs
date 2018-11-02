
public class ChargerTester {

	public static void main(String[] args) {

		int[] rates = { 50,  60, 160,  60,  80, 100, 100, 120,
			       150, 150, 150, 200,  40, 240, 220, 220,
			       200, 200, 180, 180, 140, 100,  80,  60};
		
		BatteryCharger charger = new BatteryCharger(rates);
		
		// temporarily make getChargingCost public to test this method
		/*
		System.out.println( charger.getChargingCost(12, 1) ); 
		System.out.println( charger.getChargingCost(0, 2) ); 
		System.out.println( charger.getChargingCost(22, 7) ); 
		System.out.println( charger.getChargingCost(22, 30) ); 
		*/
		
		// test getChargeStartTime
		System.out.println( charger.getChargeStartTime(1) );
		System.out.println( charger.getChargeStartTime(2) );
		System.out.println( charger.getChargeStartTime(7) );
		System.out.println( charger.getChargeStartTime(30) );
	}

}
