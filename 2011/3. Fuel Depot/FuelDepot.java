import java.util.List;

public class FuelDepot {
	
	private FuelRobot filler;
	private List<FuelTank> tanks;
	
	public FuelDepot(FuelRobot filler, List<FuelTank> tanks) {
		this.filler = filler;
		this.tanks = tanks;
	}
	
	public int nextTankToFill(int threshold) {
		
		int loc = filler.getCurrentIndex();
		int low = tanks.get(loc).getFuelLevel();
		
		for (int i=0; i<tanks.size(); i++) {
			int level = tanks.get(i).getFuelLevel();
			
			if (level <= threshold && level < low) {
				loc = i;
				low = level;
			}
		}

		return loc;
	}
	
	public void moveToLocation(int locIndex) {
		
		int currentLoc = filler.getCurrentIndex();
		
		if (filler.isFacingRight() && locIndex < currentLoc ||
			!filler.isFacingRight() && locIndex > currentLoc) {
			filler.changeDirection();
		}
		
		int distance = Math.abs(currentLoc - locIndex);
		
		filler.moveForward(distance);
	}

}
