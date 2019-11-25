
public class BatteryCharger {

	private int[] rateTable;
	
	public BatteryCharger(int[] rateTable) {
		this.rateTable = rateTable;
	}
	
	private int getChargingCost(int startHour, int chargeTime) {
		
		int cost = 0;
		int endHour = startHour + chargeTime;

		for (int hour = startHour; hour < endHour; hour++) {
			cost += rateTable[hour % 24];
		}
		
		return cost;
	}
	
	public int getChargeStartTime(int chargeTime) {
		
		int startHour = 0;
		int low = getChargingCost(0, chargeTime);
				
		for (int hour = 1; hour < 24; i++) {
			int cost = getChargingCost(hour, chargeTime);
			
			if (cost < low) {
				low = cost;
				startHour = hour;
			}
		}
		
		return startHour;
	}
}
