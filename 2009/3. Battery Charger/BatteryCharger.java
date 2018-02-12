
public class BatteryCharger {

	private int[] rateTable;
	
	public BatteryCharger(int[] rateTable) {
		this.rateTable = rateTable;
	}
	
	public int getChargingCost(int startHour, int chargeTime) {
		
		int cost = 0;
		int endHour = startHour + chargeTime;

		for (int i=startHour; i<endHour; i++) {
			cost += rateTable[i % 24];
		}
		
		return cost;
	}
	
	public int getChargeStartTime(int chargeTime) {
		
		int startHour = 0;
		int low = getChargingCost(0, chargeTime);
				
		for (int i=1; i<24; i++) {
			int cost = getChargingCost(i, chargeTime);
			
			if (cost < low) {
				low = cost;
				startHour = i;
			}
		}
		
		return startHour;
	}
}
