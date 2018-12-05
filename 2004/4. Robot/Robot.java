import java.util.Arrays;

public class Robot {

	private int[] hall;
	private int pos;
	private boolean facingRight;
	
	public Robot(int[] hall, int pos, boolean facingRight) {
		this.hall = hall;
		this.pos = pos;
		this.facingRight = facingRight;
	}
	
	public boolean forwardMoveBlocked() {
		if (facingRight) {
			return pos == hall.length - 1 
		}
		else {
			return pos == 0;
		}
	}
	
	public void move() {
		if (hall[pos] > 0) {
			hall[pos] -= 1;
		}
		
		if (hall[pos] == 0){
			if (forwardMoveBlocked()) {
				facingRight = !facingRight;
			}
			else if (facingRight) {
				pos += 1;
			}
			else {
				pos -= 1;
			}
		}
	}
	
	public int clearHall() {
		
		int count = 0;
		
		//System.out.println(count + ": " + Arrays.toString(hall));
		
		while (!hallIsClear()) {
			move();
			count++;
			
			//System.out.println(count + ": " + Arrays.toString(hall));
		}
		
		return count;
	}
	
	public boolean hallIsClear() {
		
		for (int items : hall) {
			if (items > 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public int[] getHall() {
		return hall;
	}

}

