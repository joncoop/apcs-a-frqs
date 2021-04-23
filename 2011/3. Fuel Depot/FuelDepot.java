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
		int low = threshold;
		
		for (int i=0; i<tanks.size(); i++) {
			int level = tanks.get(i).getFuelLevel();
			
			if (level <= low) {
				loc = i;
				low = level;
			}
		}

		return loc;
	}
	
	public void moveToLocation(int locIndex) {
		
		int currentLoc = filler.getCurrentIndex();
		boolean facingRight = filler.isFacingRight();
		
		if (facingRight() && locIndex < currentLoc || !facingRight() && locIndex > currentLoc) {
			filler.changeDirection();
		}
		
		int distance = Math.abs(currentLoc - locIndex);
		
		filler.moveForward(distance);
	}

}
