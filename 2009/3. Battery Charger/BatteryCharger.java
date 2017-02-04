
public class BatteryCharger {

	private int[] rateTable;
	
	public BatteryCharger(int[] rateTable) {
		this.rateTable = rateTable;
	}
	
	public int getChargingCost(int startHour, int chargeTime) {
		
		int currentHour = startHour;
		int timeRemaining = chargeTime;
		int cost = 0;

		while (timeRemaining > 0) {
			
			cost += rateTable[currentHour];
			
			currentHour = (currentHour + 1) % 24;
			timeRemaining -= 1;
		}
		
		return cost;
	}
	
	public int getChargeStartTime(int chargeTime) {
		
		int time = 0;
		int low = getChargingCost(0, chargeTime);
				
		for (int hour=1; hour<rateTable.length; hour++) {
			int cost = getChargingCost(hour, chargeTime);
			
			if (cost < low) {
				low = cost;
				time = hour;
			}
		}
		
		return time;
	}
}
