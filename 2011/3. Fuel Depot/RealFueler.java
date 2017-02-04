
public class RealFueler implements FuelRobot {

	private int location;
	private boolean facingRight;
	
	public RealFueler(int location, boolean facingRight) {
		this.location = location;
		this.facingRight = facingRight;
	}
	
	public int getCurrentIndex() {
		return location;
	}

	public boolean isFacingRight() {
		return facingRight;
	}

	public void changeDirection() {
		facingRight = !facingRight;
	}

	public void moveForward(int numLocs) {
		if (facingRight) {
			location += numLocs;
		}
		else {
			location -= numLocs;
		}
	}

}
