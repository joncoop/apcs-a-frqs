
public class RealTank implements FuelTank {

	private int fuelLevel;
	
	public RealTank(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	public int getFuelLevel() {
		return fuelLevel;
	}

}
